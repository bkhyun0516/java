package scanner;

import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		// scan은 생성된 스캐너 객체의 레퍼런스가 담긴 변수이지 스캐너 객체가 아니다.
		
		System.out.println("정수 2개 입력");
		int num1 = scanner.nextInt(), num2 = scanner.nextInt();
		int result = (num1+num2);		
		System.out.println(num1 + " + "+  num2 + " = "+(num1+num2));
		System.out.println(num1 + " + "+  num2 + " = "+result);
	}
}
