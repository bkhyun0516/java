package array;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * 자바스크립트 배열 -> 자바 List 클래스
		 * 
		 * 자바의 배열은 크기 고정에
		 * 메서드도 없다.
		 * (그래서 컬랙션 클래스들을 활용한다.)
		 * 
		 * 배열과 for문간의 연관관게 높음
		 * 
		 */
//		int[] iArr = new int[4];
//		
//		System.out.println(iArr[2]);
//		iArr[0]=3;
//		iArr[1]=6;
//		iArr[2]=5;
//		iArr[3]=3;
		
		int[] iArr = {3,5,7,9,11,13,20,100};
		for(int i=0;i<iArr.length;i++) {
			System.out.println(iArr[i]);
		}//for end
		/*
		 * 
		 * 향상된 for문 (for each문)
		 * for(자료형 변수 : 배열 혹은 컬랙션){
		 * 
		 * }
		 * 
		 */
		
		for (int num : iArr) {
			System.out.println(num);
		}//for each end
	}

}
