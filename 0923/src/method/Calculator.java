package method;

public class Calculator {

		
	/* 멤버필드의 선언
	 * 접근제한자 (스태틱) 자료형 이름;
	 * 
	 * (멤버)메서드의 선언
	 * 접근제한자 (static) 리턴자료형 메서드명(인자 ..){
	 * 		구문.....
	 * }
	 * 
	 * 
 	 */
	
	//클래스명. 이면 스태틱~ 빠밤!
	// 객체명. 이면 인스턴스 빠밤!
	
	// void는 리턴값이 없다라는 뜻이다.
	
	
	//더하는 메서드
	public static int add(int a, int b) {
		return a + b;
	}
	//빼는 메서드
	public static int subtract(int a, int b) {
		return a - b;//리턴 키워드가 없으면 안된다!
	}
	//곱하는 메서드
	public static int multiply(int a, int b) {
		return a * b;
	}
	//나누는 메서드
	public static double devide(double a,int b) {
		//인자하나를 double로하던가
		//둘다 int로 받고 return (double)a / b;하자
		// 아무고토 안하면 몫만 나온다.
		return a / b;
	}
}
