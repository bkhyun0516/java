package access;

public class A {
	/*
	 * default는 접근제어자를 생략하는것으로 나타내지
	 * 직접적으로 키워드로 사용하지 않는다.
	 * 
	 * 
	 * default 키워드는 switch문에서 사용되어 
	 * 접근제어자와 관련없다.
	 */
	
	void test() {
		/*
		 * 같은 클래스 내부이기 때문에
		 * a, b, c, d 전부 접근 가능하다.
		 * this. 이 생략되었다.
		 */
		a =10;
		b =10;
		c = new A();
		d ="zz";
	}
	
	// 접근제한자가 private이고
	// 기본자료형 int 형인
	// 인스턴스 멤버필드 a
	private int a;
	// 접근제한자가 default이고
	// 기본자료형 int 형인
	// 인스턴스 멤버필드 b
	int b;
	// 접근 제한자가 protected이고
	// 객체 자료형 클래스 A형인
	// 인스턴스 멤버필드 c 
	protected A c;
	// 접근제한자가 public이고
	// 객체 자료형 String인
	// 인스턴스 멤버필드 d
	public String d;
}
