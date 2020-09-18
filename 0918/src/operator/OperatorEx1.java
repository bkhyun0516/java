package operator;

public class OperatorEx1 {
	 public static void main(String[] args) {
		 
		/*
		 * 산술연산자(숫자끼리)
		 * 1) + : 덧셈연산 
		 * 		: 문자열 합침연산(<- 산술연산자 아니다~)
		 * 
		 * 				피연산자 중에 하나라도
		 * 				문자열이 있으면
		 *				나머지 하나도 문자열로
		 *				변경하여 문자열끼리 합침
		 * 
		 * 
		 * 2) - : 뺄셈연산
		 * 3) *	: 곱셈연산
		 * 4) / : 나눗셈연산
		 * 5) % : 나머지연산
		 * 
		 * 		
		 */
		 String s = "4";//클래스는 객체 자료형이다!
		 int i=2;
		 System.out.println(s+i);
		 //덧셈연산
		 int a= 4;
		 int b =5;
		 int result = a+b;
		 System.out.println("4+5="+result);
		 //뺄셈연산
		 result= a - b;
		 System.out.println("4-5="+result);
		 //곱셈연산
		 result= a * b;
		 System.out.println("4*5="+result);
		 //나눗셈
		 int c = 5;
		 int d = 2;
		 double result2= (double)c/d;
		 System.out.println(result2);
		 
		 //나머지연산(odd or even?)
		 
		 result = c%d;
		 System.out.println("5%2="+result);
		 
	}
}
