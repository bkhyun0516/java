package control;

public class WhileEx1 {

	public static void main(String[] args) {
		/*
		 * 분기문은 if문, switch문이 잇음
		 * 모든 switch 문은 if 문이 변경이
		 * 가능하나, 모든 if문을
		 * switch 문으로 변경은 불가능
		 * 
		 * 반복문은 for, while문이 있음
		 * 완벽하게 호환가능
		 * 
		 * - for: 반복횟수를 알고 있을때
		 * - while: 반복횟수를 모를 때
		 * (그러나~ 상호호환가능)
		 * 
		 */
		
		//2,4,6,8,10 출력
//		for(int i=2; i<=10; i+=2) {
//			System.out.println(i);
//		}//for end
		int i=1;
		/*
		 * while(조건식){
		 * 	반복구문
		 * }
		 * 
		 * 
		 */
		while(true) {
			if(i<11) {
				break;
			}//if end
			System.out.println(i);
			i++;
		}//while end
		
		
	}//main() end

}
