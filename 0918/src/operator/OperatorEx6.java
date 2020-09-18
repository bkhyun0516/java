package operator;

public class OperatorEx6 {

	public static void main(String[] args) {
		/*
		 * 비트연산자
		 * - |
		 * - &
		 * 
		 * 
		 * 비트연산자와 논리연산자의 차이는
		 * 비트연산은 피연산자 1,2 모두 실행됨
		 * 
		 * 논리연산으 논리(true or false)가
		 * 중요하기 때문에 피연산자1이
		 * true이거나 false일 때
		 * 피연산자2가 수행되지 않는다.
		 */
		byte a = 1;
		byte b = 2;
		int c = 1 | 2;
		System.out.println(c);
		System.out.println(true|false);
		System.out.println(true&true);
		
		
	}

}
