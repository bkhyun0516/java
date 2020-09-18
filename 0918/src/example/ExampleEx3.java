package example;

import java.util.Scanner;

public class ExampleEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		int num1 = scan.nextInt(), num2 = scan.nextInt();
		System.out.println(num1 +" > "+ num2+" = "+ (num1>num2));

	}

}
