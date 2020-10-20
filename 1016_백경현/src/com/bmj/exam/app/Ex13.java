package com.bmj.exam.app;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.bmj.exam.dao.MoviesDAO;
import com.bmj.exam.vo.Movie;

public class Ex13 {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		DecimalFormat format1 = new DecimalFormat("###,###,###명");
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 영화제목을 입력해주세요.");
		String str = scan.nextLine();// 영화제목 입력 받음
		String word = "%"+str.toLowerCase()+"%";// 검색문자로 문자열 가공
		List<Movie> movies = MoviesDAO.search(word);
		//출력부분
		if(scan!= null) {
			scan.close();
		}//if end
		if(movies.size() != 0) {
			for (Movie movie : movies) {
				System.out.println( movie.getNo() +")   "+ movie.getName() +
									" / 감독 : " + movie.getDirector()+
									" / 개봉일 : " + format.format(movie.getReleaseDate()) +
									" / 관객수 : " + format1.format(movie.getAudienceNum()) +
									" / 장르 : " + movie.getGenre());
			}//for end
		}
		else {
			System.out.println("검색된 영화가 없습니다.");
		}//if~else end
	}

}
