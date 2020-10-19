package com.bmj.exam.app;

import java.util.Scanner;

import com.bmj.exam.dao.GenresDAO;
import com.bmj.exam.vo.Genre;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("변경할 장르번호를 입력하세요.");
		int no = Integer.parseInt(scan.nextLine());
		System.out.println("변경할 장르명를 입력하세요.");
		String name = scan.nextLine();
		Genre genre = new Genre(no,name);
		int result = GenresDAO.update(genre);
		if(scan!= null) {
			scan.close();
		}
		System.out.println(result+"개의 장르명이 잘 변경되었습니다.");
	}// main end

}
