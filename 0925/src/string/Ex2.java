package string;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * - length():  길이
		 * 
		 */
		
		String s = "ABCDEFG";
		System.out.println(s.length());
		
		/*
		 * - substring(시작인덱스)
		 * : 시작인덱스부터 끝까지의 문자열을
		 * 리턴
		 * - substring(시작, 끝-1)
		 * : s.substring(0,s.length()); 일 때
		 * 전체 문자열이 선택되도록 하기위해 끝-1 이다.
		 * 인자가 인덱스 범위를 벗어나면 
		 * StringIndexOutOfBoundsException error 나온다.
		 */
		String sk = "가나다라마바사아";
		String ssk;
		ssk = sk.substring(3);//시작인덱스
		System.out.println(ssk);
		ssk = sk.substring(0,200);//시작인덱스
		System.out.println(ssk);
		//s.substring(0,s.length()): 문자열 원래 전체 
		//값비교 : true 
		System.out.println(s.equals(s.substring(0, s.length())));
	}

}
