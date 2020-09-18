package operator;

public class OperatorEx5 {
	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * 
		 * true:1 , false : 0 표기
		 * 논리곱: &&
		 * 
		 * 		a		b      a && b
		 * 		1	|	1	|	 1
		 * 		1	|	0	|	 0
		 * 		0	|	1	|	 0
		 * 		0	|	0	|	 0
		 *  :둘 다 true일 때 만 true
		 *  
		 * 논리합: ||
		 *  	a	 	b      a || b
		 * 		1	|	1	|	 1
		 * 		1	|	0	|	 1
		 * 		0	|	1	|	 1
		 * 		0	|	0	|	 0
		 * 	:둘 다 false일 때 만 false
		 * 
		 */
		System.out.println(false || true);
		System.out.println(true && false);
		System.out.println(false && false);// 뒤에 데드코드
		System.out.println(true || false);// 뒤에 데드코드
		
	}
}
