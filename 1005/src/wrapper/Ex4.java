package wrapper;

public class Ex4 {
	public static void main(String[] args) {

		/*
		 * 자바 5에 추가된 개념
		 * 오토박싱
		 * 언박싱
		 * 
		 * 
		 * why? 빈번하게 사용되고 편리하게
		 * 사용하기 위해서 새로 추가됨
		 * 
		 * true, false값
		 * -128~127 까지의 객체를 생성해 놓은 후
		 * 상수풀에 추가시킴
		 * 
		 */
		Integer i = 3;
		Integer i2 = 3;
		Integer i3 = new Integer(3);
		Integer i4 = new Integer("3");
		Integer i5 = 128;
		Integer i6 = 128;
		
		System.out.println(i==i2);
		System.out.println(i5==i6);

		
	}//main() end
}
