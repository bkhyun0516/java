package test;

public class TestApp {

	public static void main(String[] args) {
		Object t = new Test(3);
		Object t2 = new Test(3);
		Object t3 = new Test(4);
		//멤버필드 a값이 같으면 true 리턴하도록
		// equals를 overriding
		System.out.println(t.equals(t2));	
		System.out.println(t.equals(t3));	
	}

}
