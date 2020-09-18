package control;

import java.util.Scanner;

public class ControlEx1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이는?");
		
		int age = scan.nextInt();
		// 만일 나이가 20살 이상이면
		//당신은 성인입니다. 출력
		//20살 미만이면
		//당신은 성인이 아닙니다. 출력
		scan.close();
//		String msg="";
		String msg="이 아닙";
		if(age >= 20) {
			msg ="입";
		}
//		else{
//			msg ="이 아닙";
//		}//if~else end
		
		System.out.println("당신은 성인"+ msg+"니다.");
		
//		System.out.println("당신은 성인"+
//		(age>=20?"입":"이 아닙")
//		+"니다.");								//삼항연산자 버전
				
	}//main end

}// Control1Ex end;
