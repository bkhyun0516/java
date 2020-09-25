package band;

public class A {
	int a;
	A b;
	void test(A a) {
		b = a;
	}
	void test2(int a) {
		a = a;
	}
	public static void main(String[] args) {
		A a = new A();
		a.b= new A();
		A b = a.b;
		a.test(new A());
		b.test(a);
		a.a = 10;
		b.a =5;
		a.test2(4);
		b.test2(7);
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(a.b.a);
		System.out.println(b.b.a);
	}
}
