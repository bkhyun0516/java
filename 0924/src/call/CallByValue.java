package call;

public class CallByValue {
	
	void test(int a) {
		a++;
	}//test() end
	
	public static void main(String[] args) {
		int a =5;
		CallByValue cbv = new CallByValue();
		cbv.test(a);
		System.out.println(a);
	}//main() end
	
}
