package oop;

public class Ex1 /*extends Object*/{
	int a = 10;
	
/*	public Ex1() {
		super();
	}
*/	
	
	public static void main(String[] args) {
		Ex1	e = new Ex1();
//		Ex1	e2 = new Object();//안된다.
		
		Object obj = new Ex1();//인스턴스 내부에 Object객체가 있기 때문에 가능하다.
		//"obj. " 해 도 a가 나오지 않는다.
		
		int[] a = new int[2];

	}	
}
