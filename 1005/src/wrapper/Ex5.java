package wrapper;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 오토박싱: 기본 -> 객체
		 * 언박싱: 객체 -> 기본
		 * 
		 * 
		 */
		int i =10;
		Integer i2 = i;//오토박싱
		i = i2;//언박싱( Integer 객체 안의 value를 대입)
		Integer im = new Integer(129);
		i = im;
		System.out.println(i);
		
	}

}
