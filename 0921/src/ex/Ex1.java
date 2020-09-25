package ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//스캐너 객체 선언
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=scan.nextInt();
		String msg = score >=90 ? "합격":"불합격";
		System.out.println(msg);
	}
}