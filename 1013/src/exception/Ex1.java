package exception;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
	/*
	 * 지금까지 공부했던 예외들
	 * 
	 * 
	 * 
	 */
	
	//	NullPointerException	
	//	String str = null;
	//	System.out.println(str.substring(1));
	//	System.out.println("크킄크큭");
		
		//ArrayIndexOutOfBound
	//	int[] iArr = new int[3];
	//	System.out.println(iArr[4]);
		
	//	StringIndexOutOfBoundException
	//	String str ="121";
	//	System.out.println(str.substring(5));
			
	//	NegativeArraySizeException
	//	int[] iArr = new int[-1];

//		NumberFormatException
//		int i = Integer.parseInt("AAA");

//		ClassNotFoundException
//		Class.forName("asdfvadfadg");
		
		
//		ClassCastException
//		Object obj = new String("test");
//		Ex1 e = (Ex1) obj;

		
//		ArithmeticException
//		System.out.println(5/0);
		Random ran = new Random();
		String[] cArr =  {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (int i = 0; i < 7; i++) {
			int num = ran.nextInt(13);
			System.out.print(cArr[num]+" ");
			
		}//for end

		
	}//main() end

}
