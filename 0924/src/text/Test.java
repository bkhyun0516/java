package text;

public class Test {
	public static void main(String[] args) {
		// 다른 클래스에 있는
		//  스태틱 맴버필드 a를 지정할때
		// 클래스명. 을 생략할 수 없다.
		A b = new A();
		b.a = 10;
		int a = b.test(6, 5);
		a = b.test(b.a, a);
	}
}
