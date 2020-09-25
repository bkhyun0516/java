package secret;

/*
 * 1) java.lang패키지에 있는 클래스들은
 * 빈번하게 사용되기 때문에 import 생략가능
 * 
 * 2) 	
 * 
 * 
 */

import java.lang.*;

public class Ex {
	
	static int a;
//	int a;
	int b;
	void test() {
		int b;
		this.b =10;
		b=5; 
		/*
		 *  test와 b는 공동운명체라서
		 *  객체 만들어질 때 같이 만들어지고
		 *  객체가 사라질 때 같이 사라지기 때문에 
		 *  this 사용가능
		 *  
		 *  3) 같은 클래스 내부에서
		 *  인스턴스 멤버들 끼리 접근시
		 *  this. 생략 할 수 있다.
		 */
	}
	/*
	 * 
	 * 개발자가 단 한개라도
	 * 생성자를 선언하지 않으면
	 * 컴파일러가 컴파일시
	 * 기본생성자를 하나 만들어준다.
	 * 
	 * 
	 * 
	 * 하지만, 개발자가 단 한개라도
	 * 생성자를 선언하면
	 * 컴파일러는 컴파일시 안만들어준다!!
	 * .java 파일엔 없지만 .class파일엔
	 * 기본생성자가 존재하게 됩니다!
	 * 
	 */
	
	public static void main(String[] args) {
		//스태틱 메서드 내부는 this 안된다.
		/*
		 * 같은 클래스 내부에서 
		 * static 멤버들 끼리 접근할때
		 * 클래스명. 을 생략할 수 있다.
		 */
		
		
		Ex.a = 5;
		Ex e = new Ex();
	    a=2;//Ex.a
		int a;
		a =10;
		System.out.println(Ex.a);
		System.out.println(a);
		System.out.println(e.b);
		e.test();
		System.out.println(e.b);
		
//		this.b = 10;//않되 
		
		
		
	}// main() end

}//






