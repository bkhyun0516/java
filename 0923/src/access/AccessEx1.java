package access;

import test.B;

public class AccessEx1 {

	public static void main(String[] args) {
		// 지역변수는 외부에서 접근 불가이기 때문에 접근제한자 없다.
		int xyz=0;
		/*
		 *  접근제한자(access modifier)
		 *  
		 *  - public
		 *  	:어디서든지 접근가능
		 *  - protected
		 *  	: 같은 패키지와
		 *  		상속관계일때만 접근 가능
		 *  - (default)
		 *  	: 같은 패키지 내부에서만
		 *  - private
		 * 		: 같은 클래스 내부에서만 접근 가능
		 * 
		 */
		/*
		 * "A a" : A 클래스를 가지고 만들어진
		 *  객체의 레퍼런스를 담을 수 있는
		 *  지역변수 a를 선언하고
		 * "new A()" : new라는 키워드로 heap메모리 영역에
		 *  공간을 할당받고 A클래스 생성자호출하여
		 *  객체를 생성한 후
		 * " = ": 그 객체의 레퍼런스를 a에 대입 
		 */
		A a = new A();
		//private으로 선언된 a 멤버필드에는
		//접근 불가
		a.b = 10;
		a.c =a;
		a.d ="크크";
		
		B b = new B();
		// B와 Ex1은 다른 패키지에 있기 때문에
		// (상속관계도 아님)
		// 접근제한자가 public인 d만 접근가능
		b.d = a.d;
		System.out.println(b.d);
	}// main() end

}
