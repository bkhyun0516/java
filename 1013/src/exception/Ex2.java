package exception;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * try{
		 * 	예외가 발생할 가능성이 있는 구문
		 * }catch(Exception e){
		 * 	예외가 발생했을때 수행 할 구문
		 * }
		 * 
		 * 
		 * 
		 */
		
		Random ran  =  new Random();
		int count=0;
		for (int i = 0; i < 100; i++) {
			int num = ran.nextInt(5);
			try {
				System.out.println(i+") "+ 5/num);
			}catch(Exception e) {
				System.out.println(i+ "번에서 캐치캐치!!!!!");
				count++;
			}//try~catch end
		}
		System.out.println(count+"번 에러발생");

	}//main()

}
