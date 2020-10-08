package oop;
class B/*extends Object */ {
	int a = 5;
	void test() {
		System.out.println("🍕");
	}
}
class C extends B{
	int a = 10;
	void test(int a) {
		System.out.println("🍔");
	}
	void test() {
		System.out.println("🍟");
		
	}
	
}
/*
 * 오버라이딩이란?
 * - 메서드재정의
 * - 상속관계에서
 * - 부모에게 물려받은 메서드를
 *   새로운 기능으로 재정의 
 * - 조상의 메서드를 호출해도
 *   최하위 자손의 메서드가 실행된다!!
 * 
 *
 * 
 */
public class OverridingEx {

	public static void main(String[] args) {
		Object o = new C();
//		B o2 = new C();
//		C o3 = new C();
		B b = (B) o;
		C c = (C) b;
		b.test();
		b.test();
		c.test(3);
		
	}

}
/*
 * 오버라이딩은 메소드 재정의
 * 상속관계에서 상위의 메소드를 호출해도
 * 최하위의 메소드가 작동한다?!!!
 * 
 * 
 */