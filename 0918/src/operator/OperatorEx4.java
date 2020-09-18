package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		/*
		 * 
		 * 삼항연산자
		 * 
		 *  변수 = 논리값 ? 값1 : 값2;
		 * 
		 * 논리값이 true면 값 1 변수에 대입
		 * 논리값이  flasㄷ면 값 2가 변수에 대입
		 * 
		 * 
		 */
		
		
		int a = 3==7 ? 4 : 7;
		// 항등
		// 삼항	
		// 대입 순
		// 삼항연산자는 무조건  if~else 문으로 바꿀수있다.
		//
		if(3==7) {
			a=4;
		}else {
			a=7;
		}
		
		System.out.println(a);
	}

}
