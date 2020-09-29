package equal;

class A {
	int a;//멤버필드
	public A() {}
	public A(int a) {
		this.a = a;
	}//생성자
}

public class Ex1 {
	public static void main(String[] args) {
		//객체의 항등이란 레퍼런스 비교
		A a = new A(3);
		A b = new A(3);
//		b = a;//주석 처리시 a와 b의 레퍼런스가 달라서 false
		System.out.println(a == b);
		//모든객체에는 equals메서드가 있다.
		System.out.println(a.equals(b));
		
	}
}