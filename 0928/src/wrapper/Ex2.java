package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 
		 * String과 Wrapper클래스들이 똑같다
		 * 
		 */
		
		Integer i = new Integer(3);
		Integer i2 = new Integer(3);
		System.out.println(i==i2);//레퍼런스비교
		System.out.println(i.equals(i2));//값비교
		
	}

}
