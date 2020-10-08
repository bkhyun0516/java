package oop;
class A {
	int a = 1;
	
}
public class E extends A {
	int a = 10;
	public static void main(String[] args) {
		Object e = new E();
		A a = (A) e;
		//String s = (String) e;//e와 연결된 인스턴스 내에 String 객체가 없어서
								// 캐스팅 익셉션 에러 뜬다.
		E o = (E) a;//
//		o = "TEST";//
		e = "TEST";
	}//main() end

}
