package com.bmj.exam.app;

import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.Scanner;

import com.bmj.exam.dao.GenresDAO;
import com.bmj.exam.dao.MoviesDAO;
import com.bmj.exam.vo.Genre;
import com.bmj.exam.vo.Movie;

public class Ex14 {
	public static boolean checkInt(String s) {//정수 형식 변환 가능 체크 메서드
	    try {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	 }
	public static void printGenreList(List<Genre> genres) { //장르 리스트 출력 메서드
		int size = genres.size();
		for (int i = 0; i < size; i++) {
			System.out.print(genres.get(i).getNo() + ") "
					+genres.get(i).getName());
			if(i != size-1) {
				System.out.print(" / ");
			}else {
				System.out.println();
			}
		}
	}
	public static boolean checkDate(String s) {
		try {
			Date.valueOf(s);
			return true;
		} catch(Exception e){
			return false;
		}
	}
	public static void main(String[] args) {
		//포멧 설정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd(년-월-일)");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		//현재 날짜 데이터 객체 설정
		java.util.Date date= new java.util.Date();
		
		// 장르 리스트 가져오기
		List<Genre> genres= GenresDAO.selectListNo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("📽  영화 입력 프로그램 📽  ");	
		//장르번호 입력 부분
		printGenreList(genres);//장르 리스트 출력 메서드
		System.out.println("장르 번호를 입력해 주세요.");
		String genreStr = scan.nextLine();
		int genre = 0;
		while(true) {
			if(!checkInt(genreStr)) {//정수 형식 변환 가능 체크
				System.out.println("정확한 장르 번호를 입력해 주세요.");
				printGenreList(genres);//장르 리스트 출력 메서드
				System.out.println("장르 번호를 입력해 주세요.");
				genreStr =scan.nextLine();//입력번호 갱신
				continue;
			}
			genre = Integer.parseInt(genreStr); //정수로 변환
			List<Genre> list = GenresDAO.searchNo(genre); // 장르테이블에 존재 확인
			if(list.size() != 0) {//장르 테이블에 있다.
				break;//조건 만족 탈출(장르테이블에 존재)
			}else {//장르 테이블에 없다.
				System.out.println("정확한 장르 번호를 입력해 주세요.");
				printGenreList(genres);//장르 리스트 출력 메서드
				System.out.println("장르 번호를 입력해 주세요.");
				genreStr =scan.nextLine();//입력번호 갱신
			}
		}
		//영화이름& 감독이름 입력부분
		System.out.println("영화 이름을 입력해 주세요.^-^");
		String name =scan.nextLine();
		System.out.println("감독 이름을 입력해 주세요.^-^");
		String director =scan.nextLine();
		//개봉일 입력부분
		System.out.println("아래와 같은 포맷으로 개봉일을 입력해 주세요.");
		System.out.println(format.format(date));//포맷출력
		String releaseDateStr = scan.nextLine();//문자열 입력받음
		while(!checkDate(releaseDateStr)) {//입력받은 문자열이 포맷에 맞지않을경우 맞을 때까지 반복
			System.out.println("제대로 된 포맷으로 입력해 주세요.");
			System.out.println("아래와 같은 포맷으로 개봉일을 입력해 주세요.");
			System.out.println(format.format(date));
			releaseDateStr = scan.nextLine();
		}
		Date releaseDate = Date.valueOf(releaseDateStr);//포맷에 맞는 문자열 Date 객체로 저장
		
		// 종료일 입력부분
		System.out.println("아래와 같은 포맷으로 종료일을 입력해 주세요.");
		System.out.println(format.format(date));
		String endDateStr = scan.nextLine();
		Date endDate =null;
		if(endDateStr.equals("")) {//엔터값 입력 했는지 확인
			endDate = Date.valueOf(format2.format(date));//기본값인 금일 포맷에 맞게 입력
		}else {// 일반적 문자열 입력했다면
			while(!checkDate(endDateStr)) {//포맷에 맞는 문자열인가 확인
				System.out.println("제대로 된 포맷으로 입력해 주세요.");
				System.out.println("아래와 같은 포맷으로 종료일을 입력해 주세요.");
				System.out.println(format.format(date));
				endDateStr = scan.nextLine();//입력갱신
				if(endDateStr.equals("")) { //새로 받은 문자열이 엔터라면
					endDateStr = format2.format(date);//기본값으로 문자열 수정
				}		
			}
			System.out.println(endDateStr);
			endDate = Date.valueOf(endDateStr);//최종 검증값 객체에 삽입
		}		
		//관객수 입력 부분
		System.out.println("관객수를 입력해주세요. (없으면 그냥 엔터)");
		String audienceNumStr = scan.nextLine();
		int audienceNum;
		if(audienceNumStr.equals("")) {//엔터 입력 처리
			audienceNum =0;
		}else {
			audienceNum = Integer.parseInt(audienceNumStr);
		}
		//입력받은 데이터들로 객체 생성 
		Movie movie = new Movie(audienceNum, genre, name, director, releaseDate, endDate);
		//테이블에 삽입
		int result = MoviesDAO.insert(movie);	
		if(scan!= null) {
			scan.close();
		}
		//결과 출력
		System.out.println(result + "개의 영화가 등록되었습니다.");
	}

}
