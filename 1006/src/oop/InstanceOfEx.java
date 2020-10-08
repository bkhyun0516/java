package oop;

public class InstanceOfEx {
	public static void main(String[] args) {
		Object o = new C();
		//intanceof는 연산자
		// 변수 intanceof 클래스
		//강제형변환 시 ClassCastException을 피하기 위해서 선검사 용도
		System.out.println(o instanceof Object);//true	인스턴스에 Object 있다.	
		System.out.println(o instanceof E);//true	인스턴스에 E 없다.	
		System.out.println(o instanceof String);//false	인스턴스에 String 있다.
		for(int i=1; i<10; i++) {
			System.out.println("🥨");
			if(o instanceof String) { //safe code
				String s = (String)o;
				System.out.println(s.substring(1));
			} //if end?
		}//for end
	}//main end()
}
