package scanner;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		//스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 취미는?");
		// 유저가 입력한 취미를 받음
		//scan.next()은 공백 글자 까지 받는다.
		String hobby = scan.nextLine();
		
		System.out.println("당신의 취미는 "+hobby+"입니다.");
		

	}

}
