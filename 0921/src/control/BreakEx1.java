package control;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		
		/*
		 *  break구문 만나면 반복문을 멈춤
		 *  
		 *  
		 */
//		for(int i=0;i<100000; i++) {
//			System.out.println(i);
//		}
		Scanner scan = new Scanner(System.in);
		int secret=1234;
		while(true) {
			System.out.println("비밀번호 입력하세요");
			int password = scan.nextInt();
			if(password==secret){break;}//end
		}
		System.out.println("환영합니다.");
	}
}
