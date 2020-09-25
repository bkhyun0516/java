package call;

public class CallByReference {
	int a;
	void test (CallByReference c) {
		c.a++;
	}
	public static void main(String[] args) {
		CallByReference c = new CallByReference();
		c.a = 10;
		c.test(c);
		System.out.println(c.a);
	}

}
