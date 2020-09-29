package wrapper;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 
		 * Wrapper들이 기본 -> 객체로 변경
		 * 하는것이므로, 편리함을 위해서
		 * 자바 5(1.5)에서 오토박싱과
		 * 언박싱을 추가했음!
		 * 
		 * 오토박싱: 기본 -> 객체	 :암시적 객체 생성
		 * 언박싱: 객체 -> 기본  	 :언박싱
		 * 
		 */
		Integer i = 3;//3을 암시적 객체생성했다!
		Integer i2 = 3;//3을 암시적 객체생성했다!
		Integer i3 = new Integer(3);//명시적 객체생성
		Integer i4 = new Integer("3");//명시적 객체생성
		System.out.println(i==i2);//true
		System.out.println(i.equals(i2));//true
		System.out.println(i==i3);//false
		System.out.println(i.equals(i3));//true
		System.out.println(i.equals(i4));//true
		int a = i;//언박싱
	}// main() end

}
