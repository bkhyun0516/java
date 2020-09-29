package array;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 배열은 객체 자료형
		 * 
		 * 자바의 배열은 길이가 고정
		 * 배열은 length속성을 가진다. 
		 * 
		 * 
		 * 배열의 생성
		 * 1) new 자료형[길이];
		 * 2) 생성 및 초기화 : {자료,자료,....};
		 * 		=> 꼬오옥! 선언과 함께 구문 작성해야한다!!
		 * 3) 
		 * 
		 */
		
		int[] iArr = {1,2,3,4,5};
		iArr = new int[4];
		System.out.println(iArr.length);
		iArr[1]=1;
		iArr[2]=2;
		iArr[3]=3;
		iArr = new int[3];
//		iArr = {1,2,3,4,5}; 안된다.
		System.out.println(iArr[1]);
		System.out.println(iArr.length);
		iArr[0]=0;
		iArr[1]=1;
		iArr[2]=2;
		//for each문
		for(int i: iArr){
			System.out.println(i);
		}
	}

}
