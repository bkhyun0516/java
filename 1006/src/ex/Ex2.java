package ex;
class Ao{
	int a =5;
	void test() {
		a =10;
	}
}
public class Ex2 extends Ao{
	int a = 100;
	void test() {
		a = 500;
	}
	public static void main(String[] args) {
		Ao a = new Ex2();
		a.test();
		System.out.println(a.a);
	}
}