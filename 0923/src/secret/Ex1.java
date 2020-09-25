package secret;

import java.util.Scanner;
//import oop.Xyz;

/*
 * 자바의 첫번째 숨겨진 비밀
 * 
 * java.lang 패키지 안에 있는 클래스들은
 * 빈번하게 사용되기때문에
 * 항상 import하면 귀찮아서
 * 편리함을 위해서 생략가능
 * 
 * import java.lang.*;
 * import java.lang.System;
 */

class A {
	static int a;
}

public class Ex1 {
	static int a;
	public static void main(String[] args) {
		Scanner scan; //같은 패키지 안에 없으면 
//		StringTokenizer stok;//import
		String s = "어어어어?";
		int a;
		/*
		 * 자바의 숨겨진 비밀 2번째
		 * 같은 클래스 내부에서
		 * static 멤버들 끼리 접근할때
		 * 클래스명.을 생략할 수 있다.
		 */
		a=5;
		System.out.println(Ex1.a);// 결과 0
		
	}//main() end
	
	/*
	 *  개발자들이 편리하게 하기 위하여
	 *  기본개념에서 생략되는것들이
	 *  상당히 많이 존재
	 *  
	 *  이를 '자바의 숨겨진 비밀'이라고 칭할 예정
	 *  
	 */
	 
}
