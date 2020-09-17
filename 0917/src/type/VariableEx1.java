package type;

public class VariableEx1 {
	
	boolean test(boolean a) {
		return a;
	}
	static int b;
	public static void main(String[] args) {
		/*
		 * 	자바의 기본 자료형
		 * 		- 논리형: boolean
		 * 		- 문자형: char
		 *		- 정수형: byte short int long
		 *		- 실수형: float double
		 *
		 *	변수
		 *		- 선언 :  자료형 변수명;
		 *		- 대입 및 초기화 : 
		 *
		 *	메서드 안에 선언된 변수들을 지역변수라 한다.
		 *	멤버 필드안에 쓴 변수는 멤버변수	
		 *
		 *  지역변수는 반드시
		 *  초기화(대입)하여 사용해야만 한다.
		 *
		 */
		
		
		// 기본 자료형 int형 변수 a를 선언
		int a;
		//지역 변수 a에 10을 대입(초기화)
		a=10;
		//지역 변수 a에 100을 대입
		a=100;
		System.out.println(a);
		
		System.out.println(b);
		
		
	}	// main() end
	
}// TypeEx1 end
