package control;

public class ControlEx3 {
	public static void main(String[] args) {
		/*
		 * 제어문
		 * - 분기문: if, switch
		 * - 반복문: for, while
		 * 
		 * 
		 * for문 문법
		 * for(초기식;조건식;증감식){  //비워두면 무한반복
		 * 
		 * 		조건식이 true일 동안 반복구문
		 * }      	
		 * 
		 * 
		 * 실행순서
		 * 1.초기식
		 * 2.조건식
		 * 3.반복구문
		 * 4.증감식
		 * 5. 조건식이 false 될 때까지  2~4 반복?
		 * 
		 */
		
		
		for(int i=1; i<=10;++i) {
			System.out.println(i);
		}//for end
		
		
		
		int i=0;
		while(i<9) {
			System.out.println("");
			break;
		}//while end
			
	}//main end
}//ControlEx3 end
