package oop;

public class App {

	public static void main(String[] args) {
		Object o = new B();
		A a = (A) o;
		System.out.println(a.a);
		B b = (B) o;//B b = (B) a;
		System.out.println(b.a);
	}

}
