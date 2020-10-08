package oop;

public interface A {
	
	static final int A = 10;//
	//접근제한자가 default이고 자료형이 기본자료형 int 형인 스태틱 맴버필드 A
	int B=11;
	//접근제한자가 default이고 자료형이 기본자료형 int 형인 「스태틱」 맴버필드 B
	abstract void test();
	
	/*
	 * 인터페이스는 클래스와 클래스간의
	 * 접점
	 * 
	 * - 인터페이스는 클래스가 아니다.
	 *   (생성자 X, 객체 생성 안된다.)-> 인스턴스가 존재할 수가 없다!
	 * 
	 * - 인터페이스는 상수, 추상메서드만 가진다.
	 * 
	 * - 인터페이스는 상수만 가질 수 있기
	 *   때문에 static과 final을 생략할 수 있다.
	 * 
	 * - 인터페이스는 추상 메서드만 가질 수 있기
	 * 	 때문에 abstract 생략 가능
	 * 
	 * - 자바는 다중 상속이 불가능하지만,
	 * 	 다중 구현은 가능하다.
	 * 
	 * 
	 */
	
	
	
	 // 상수(인스턴스도 가능하지만 대부분 Static)
}
