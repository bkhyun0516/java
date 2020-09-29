package wrapper;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 오토박싱이 암시적 객체생성이
		 * 되는 경우
		 * 
		 * Boolean 전부
		 * Character '0~127'
		 * Byte 전부
		 * Short, Integer, Long : -128~127
		 * 
		 * 그 외에는 명시적 객체생성
		 * 
		 * 
		 */
		Character c = '가';
		Character c2 = '가';
		System.out.println(c==c2);//false
		Character c3 = 'a';
		Character c4 = 'a';
		System.out.println(c3==c4);//true
		
		
		Integer i = new Integer(3);
		Integer i2 = 3;//오토박싱
		
		int a = 3;
		
		Integer i3 = a;//오토박싱
		Integer i4 = 3;//오토박싱
		int b = i4;//언박싱
		
		System.out.println(i==i2);
		System.out.println(i==i3);
		System.out.println(i==i4);
		System.out.println(i2==i3);
		System.out.println(i2==i4);
		System.out.println(i3==i4);
		Integer[] i5 =new Integer[3];
		for(int j=0;j<3;j++) {
			System.out.println(i5[j]);
		}
		
	}

}
