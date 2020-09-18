package control;

import java.util.Scanner;

public class ControlEx5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요(2~9까지)");
		int num = scan.nextInt();
		for(int i=1; i<10;i++ ) {
			System.out.println(num+" * "+ i + " = "+ num*i);
		}
	}

}
