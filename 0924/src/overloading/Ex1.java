package overloading;

public class Ex1 {
	
	static void test(){
		System.out.println("NULL");
	}
	static void test(char c){
		System.out.println("A");
	}
	static void test(int a){
		System.out.println("B");
	}
	static void test(int a, int i){
		System.out.println("C");
	}
	static void test(double d,int a){
		System.out.println("D");
	}
	static void test(int a, double c){
		System.out.println("E");
	}
	static void test(boolean b){
		System.out.println("F");
	}
	static void test(Object c){
		System.out.println("휴~ 편안");
	}
	static void test(char c,Object o ){
		System.out.println("\" 불편~");
	}
	public static void main(String[] args) {
		
		System.out.println("두둥");
		System.out.println('ㅇ');
		System.out.println(1);
		System.out.println(true);
		test(true);
		/*
		 * 오버로딩이란?
		 * - 이름이 같고 인자가 다른것 
		 * - 인자가 다르다는 것은?
		 * 		1) 자료형이 다르다
		 * 		2) 개수가 다르다
		 * 		3) 순서가 다르다
		 *
		 * 접근제한자나 리턴자료형은 상관이 없다
		 * 	=> 왜? 호출! 할 때 문제가 되!니!까!
		 * ☆ 이름과 인자로만 영향받는다.
		 */
		
		
		
		
		
		
		
		
		
		
		
	}//main ()
}
