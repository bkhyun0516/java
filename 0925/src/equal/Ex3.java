package equal;

public class Ex3 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = null;
		String s5 = "";
		s2 = new String("Hello");
		s2 = s3;
		s3 = "HELLO";
		
		System.out.println(s1==s2);//t
		System.out.println(s2==s3);//f
		System.out.println(s3==s4);//f
		System.out.println(s4==s5);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s2.equals(s3));//f
		System.out.println(s3.equals(s4));//f
//		System.out.println(s4.equals(s5));
		// -> NullPointerException error
		// null안에는 아무것도 없어서 .equals 메소드도 없다.

	}

}
