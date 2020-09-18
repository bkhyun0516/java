package control;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
	/*	
		if(조건식1) {
		
		}else if(조건식2) {
			
		}else if(조건식3){
			
		.......
		}else if(조건식N-1){
		
		}else{
		
		}
	*/
		System.out.println("☆★☆★ 학점계산기 ver0.99 ☆★☆★");
		System.out.println("당신의 점수를 입력하세요.(0~100)");
		//Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		/*
		 * 입력점수가
		 * 
		 * 100~91점이면 A
		 * 90~81점이면 B
		 * 80~71점이면 C
		 * 70~61점이면 D
		 * 60점 이하면 F
		 */
//		char grade;
		char grade ='F';
		if(score>90) {
			grade='A';  
		}else if(score>80) {
			grade=66; //'B'
		}else if(score>70) {
			grade='C'; 
		}else if(score>60) {
			grade=68; //'D'
		}
//		else {
//			grade='F';
//		}// if~else if~else if~else if~else if~ else
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}
