package ex;

public class A {
	private int a;
	public int test(int a) {
		return a =10;
	}
	private static int test() {
		A ad = new A();
		int b = ad.test(20);
		ad.a = b;
		return ad.a;
	}
}
