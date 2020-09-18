package example;

import java.util.Scanner;

public class ExampleEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=scan.nextInt();
		System.out.println(score>=90?"합격":"불합격");
	}

}
