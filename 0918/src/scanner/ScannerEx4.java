package scanner;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력!");
		
		int a = scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();
		scan.close();//io 관련은 닫지 않으면 오류가 날수도 있다고 경고해서 닫아줌 
		System.out.println(a+"*"+b+"*"+c+"="+(a*b*c));
	}

}
