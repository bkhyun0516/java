package ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		// 유저에게 단을 입력받음
		int dan=scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}//for end
	}//main end
}
