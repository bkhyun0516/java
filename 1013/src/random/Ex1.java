package random;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		
		
		//자바스크립트처럼 Math클래스의 
		//random() 메서드를 활용할 수도 있고
		// int ran = (int)Math.random()*6;
		
		//Random 클래스를 활용할 수도 있음
		Random ran = new Random();
		int num = ran.nextInt(6)+5;
		System.out.println(num);
	
		
		
		
	}//main() end

}
