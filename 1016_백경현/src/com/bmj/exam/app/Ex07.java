package com.bmj.exam.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Ex07 {
	//중복확인 메서드
	public static boolean check(int num, int[] iArr) {
		int size = iArr.length;
		for(int i =0; i< size;i++) {
			if(iArr[i] == num)
				return false;//중복이 존재
		}
		return true;//중복 미존재
	}
	//배열 소트 메소드
	public static int[] sortArr(int[] iArr) {
		int size = iArr.length;
		for(int i =0; i< size;i++) {
			for(int j=i; j<size; j++) {
				if(iArr[j]<iArr[i]) {
					int tmp = iArr[j];
					iArr[j] = iArr[i];
					iArr[i] = tmp;
				}
			}
		}
		return iArr;
	}
	public static void main(String[] args) {
		//날짜받기
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date= new Date();
		String dateStr = format.format(date);
		System.out.println("★"+ dateStr +" 로또 1등★");
		//로또 번호 뽑기
		int[] lotto = new int[6];
		for(int i=0; i<6; i++) {		
			Random ran = new Random();
			int num = ran.nextInt(45)+1;
			while(!check(num, lotto)) { // 번호 중복검사
				ran = new Random();
				num = ran.nextInt(45)+1;
			}//while end
			lotto[i] = num;
		}
		//오름차순 정렬
		 lotto = sortArr(lotto);
		//출력부분
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]);
			if(i!=5) {
				System.out.print(", ");
			}else {
				System.out.println();
			}//if~else
		}
	}
}
