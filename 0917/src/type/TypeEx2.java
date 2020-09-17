package type;

public class TypeEx2 {
	public void test() {
		
	}
	
	public static void main(String[] args) {
	/*
	 * 
	 * 자바 기본자료형
	 * - 정수형: 
	 *	크기 
	 * 		- byte : -128~127
	 * 				(1 byte = 8 bit)
	 * 		- short: -32768~32767
	 * 				(2byte = 16bit)
	 * 		- int: -2147483648~2147483647
	 * 				(4byte = 32bit)
	 * 			 	자바의 기본 정수(기본 실수형은 double)
	 * 	
	 * 		- long: -9223372036854775808~9223372036854775807							
	 * 				(8byte = 64bit)
	 * 
	 *		1L or 1l : 'l' or 'L'을 붙여서 long형 숫자 표현 
	 * 		
	 */
		
		// 기본 자료형 byte형 변수 b를 선언
		byte b;
		// 지역 변수 b에 -128 대입(초기화)
		b= -128;
		// 지역 변수 b에 127 대입
		b= 127;
		
		// 기본자료형 short형 변수 s를 선언
		//하고 32767으로 초기화
		short s = 32767;
		
		//기본자료형 int형 변수 i를 선언
		int i;
		
		// 지역변수 i에 100을 대입(초기화)
		i=100;
		
		System.out.println(i);
		
		System.out.println(32767);//32767은 int 형
		
		//기본자료형 long형 변수 l을 선언
		long l;
		//지역변수 l에 2147483647으로  초기화(대입)
		l = 2147483647;
		// 지역변수 l에 long형 7 대입
		l=7l;
		// l= 21474836478; 숫자가 int형인데 int형의 범위를 벗어남=> 에러
		l= 21474836478L;//21474836477이상의 수는 int형으로 표현이
						//불가능 하여 무조건 'L' 붙인다.
		
		System.out.println(l);
		
		
//		System.out.println(Byte.MIN_VALUE);
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
	

		
	} //main() end
	
}// TypeEx2 end
