package animal;

public class ObjectEx1 {

	public static void main(String[] args) {
		/* 
		 * 모든 클래스의 조상 : Object
		 * (단군 할아버지 같은 존재)
		 * 
		 */
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		/*
		 * 
		 * 주요메서드
		 * equals(객체레퍼런스):
		 * 거의 대부분의 클래스들은
		 * 레퍼런스 비교
		 * String, Wrapper 값비교
		 * 
		 * -toString(): 객체를 String으로
		 * 거의 모든 클래스들은
		 * 패키지.클래스@해쉬코드16진수
		 * 
		 * String, Wrapper들은
		 * 자신들의 값이 출력
		 * 
		 * 
		 */
		 System.out.println(obj==obj2);
		 System.out.println(obj.equals(obj2));
		 System.out.println(obj.toString());
		 Integer i = new Integer(10);
		 System.out.println(i);
		 
		 /*
		  * 
		  * 기본생성자에서 super() 생략가능,
		  * 모든 생성자는 this() or super()가 있다.
		  * ->단 Object 예외로 super()가 있을수 없다.
		  * 
		  * 자바는 다중 상속이 안된다.
		  * 상속 미기입시 extends Object가 생략되었다고 본다.
		  * 
		  */
	}

}
