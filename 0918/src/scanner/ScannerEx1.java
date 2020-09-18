package scanner;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		/*
		 * 	클래스? 객체?
		 * 	
		 *  클래스는 객체 자료형이다!
		 *	
		 *	자바개발자들이 만들어놓은
		 * 	수많은 클래스들이 있습니다.
		 * 	(그 클래스 안에는 수많은 메서드
		 *	가 존재합니다.)
		 *
		 *	그래서 위의 클래스나 메서드들을
		 *	엮어 놓은 것을 API라고 합니다.
		 *	(JDK 안에 존재합니다.)
		 *
		 *
		 *
		 */
		
		/*
		 * 	같은 패키지 안에 잇는 클래스들은
		 * 	그냥 사용이 가능한데,
		 * 	다른 패키지에 있는 클래스들은
		 *	반드시 import 하여야 합니다.
		 */
		
		
		// 객체 자료형 Scanner 클래스형 
		// 지역변수 scan을 선언
		Scanner scan;//변수랑 객체를 동일시 하면 안된다.
		
		/*
		 *  Scanner 클래스를 가지고 만들어진
		 *  객체의 레퍼런스(메모리 주소가 아니다)를
		 *   담을 수 있는
		 *  지역변수 scan을 선언
		 */
		// 암기하자) 생성자 호출 => 객체 생성
		// Scanner 클래스의 생성자를 호출하여
		//		-> Scanner 객체 생성 후
		//			-> 	scan 변수에 대입.
		scan = new Scanner(System.in);
		 
		/*
		 *  new 라는 키워드로  heap 메모리 영역에
		 *  공간을 할당 받고
		 *  Scanner 클래스의 생성자를 호출하여
		 *  Scanner 객체를 생성 후 생성자의 리턴값인 레퍼런스를 
		 *  scan 변수에 대입
		 *  
		 */
		//유저에게 입력받기위한 콘솔 띄우기
		System.out.println("당신의 이름은?");
		// Scanner 클래스가 가진 메서드 중에
		// - nextLine() : 유저에게 문자열 한줄을 입력받는 메서드
		// - nextInt(); : 정수형 한개 입력받는 메서드
		String name = scan.nextLine();
		System.out.println("당신의 이름은 "+ name+"입니다.");
		
		
		
	}//main() end
}//ScannerEx1 end
