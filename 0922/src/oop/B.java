package oop;
class A {
	A a;
	int b;
}
public class B {
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		Object c = new A();//다형성
//		a.a =a; // NullPointerException 을 위해 주석처리
		a.b =3;
		System.err.println(a.a.a); // NullPointerException
		
	}
}
