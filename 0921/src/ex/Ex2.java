package ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		int num1 = scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println(num1+" > "+num2+" = " + (num1>num2));
	}

}
