package operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 	++/--
		 * 
		 * 	- 1항연산자
		 *  - 증감연산자
		 *  - 피연산자 앞에 붙으면 선위
		 *  - 피연산자 뒤에 붙으면 후위
		 *  ※ 후위 연산자는 대입연산자보다
		 *    우선순위가 낮음 
		 * 
		 */
		
		int i = 3;
		++i; //선위 증가 연산자!(결과 4)
		
		i++;// 후위 증가 연산자!(결과 5)
		
		--i; //선위 감소 연산자!(결과 4)
		
		i--;// 후위 감소 연산자!(결과 3)

		int a =4;
		a++;
		int b= a;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	
	
	}
}
