package type;

public class TypeEx1 {
	
	
	boolean b;
	
	void test() {
		//test 메소드 선언
	}
	void test1() {
		test();//test 메소드 호출
	}
	
	public static void main(String[] args) {
		/*
		 * 	- 자바의 자료형
		 * 		기본자료형
		 * 		객체자료형
		 * 
		 * 	자바의 기본자료형
		 * 	- boolean(논리형) : true, false
		 * 
		 * 	같은 지역안에는
		 *  같은 이름의 변수를 두 번(중복) 선언할 수 없다!
		 */
		
		// 기본자료형 boolean형 지역변수
		// b를 선언
		boolean b;
		// 지역변수 b에 true를 대입(초기화)
		b = true;
		
//		System.out.println(b);
		
		//기본자료형 boolean형 지역변수 a
		//를 선언하고 false로 초기화
		boolean a = false;
		
		// 지역 변수 a에 true 값을 대입
		a = true;
				
//		int b=3; 타입 상관 없이 이름이 같으면 안돼~
		System.out.println(a);
		
		
	} //main() end
	
}//TypeEx1 end
