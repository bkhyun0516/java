package ex;
class A {
	int a =7;
	void test() {
		a =10;
	}
}
public class Ex1  extends A{
	void test() {
		a = 500;
	}
	public static void main(String[] args) {
		A a = new Ex1();
		a.test();
		System.out.println(a.a);
	}
}
