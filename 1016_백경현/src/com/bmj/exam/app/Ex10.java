package com.bmj.exam.app;

import java.util.Scanner;

import com.bmj.exam.dao.GenresDAO;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 장르를 입력하세요");
		String name = scan.nextLine();
		int result = GenresDAO.delete(name);
		
		if(scan!= null) {
			scan.close();
		}// if end
		System.out.println(result + "개의 장르가 삭제되었습니다.");
	}// main end

}
