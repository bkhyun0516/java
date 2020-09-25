package equal;

public class B {
	int a;
	private B(int a) {
		this.a =a;
	}
	public static void main(String[] args) {
		B a = new B(4);
		B b = new B(7);
		B c = null;
		B d = b;
	}

}
