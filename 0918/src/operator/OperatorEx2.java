package operator;

public class OperatorEx2 {
	public static void main(String[] args) {
		//기본자료형 byte형인 지역변수 a를 선언하고
		//숫자1로 초기화(대입)
		byte a1= 127;
		
		//기본자료형 byte형인 지역변수 b를
		//선언하고 숫자 2로 초기화(대입)
		byte b1= 127;
		
		/*
		 * int 이하 자료형은
		 * 산술 연산 결과 값이 무조건 int
		 */
		int i1 = a1 + b1;
		/*
		 * int 초과의 자료형은
		 * 둘중에 큰 자료형으로 
		*/
		System.out.println(i1);
		
	}
}
