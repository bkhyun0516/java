package oop;

public class App {
	int a;
	static int b;
	static void test() {
//		a = 10; //인스턴스 매개변수 a를
				//사용하기 위해서는
			 	// 객체를 생성해 변수 a를
				// 메모리에 적재해야한다.
		b = 10; // 이미 로딩되어 있어 걍 사용가능!
		
		
	}
	static void lol() {
		test();
	}
	public static void main(String[] args) {
		
		/*
		 * 멤버에 접근할 때는
		 * 인스턴스는 객체의 레퍼런스. 으로
		 * static멤버는 클래스명. 으로
		 */
		
		App.b=7;
		System.out.println(b);
		b=11;
		System.out.println(App.b);
		test();
		
		
		/*
		 * 자바 프로그램이 실행되면
		 * 우선 static으로 선언된
		 * 멤버들(필드,메서드)이 먼저
		 * static메모리영역에 로딩됨
		 * 
		 * 그리고 main메서드를 JVM이 호출하여
		 * 프로그램이 시작됨
		 * 
		 * 그러니까 static으로 선언되 멤버들은 객체를
		 * 생성하지 않고 바로 사용가능(대입 및 호출)
		 */
		 
		
		
//		A.b=5;
//		new A().a=100;//얘는 레퍼런스 잃어버려
//					  //객체를 밑에서 사용불가
//		A a = new A();
//		a.a=10;
//		System.out.println(a.b);
//		A b =new A();
//		System.out.println(b.b);
	}

}
