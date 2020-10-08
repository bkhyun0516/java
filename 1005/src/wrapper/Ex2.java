package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		//int 형의 최대값
		System.out.println(Integer.MAX_VALUE);
		//long 형의 최소값
		System.out.println(Long.MIN_VALUE);
		// String을 int 형으로 변환
		String s = "123";
		//parseInt 메서드 사용
	    int i = Integer.parseInt(s);
		System.out.println(5+i);
		int i1 = Integer.valueOf("234");
		System.out.println(i1);
		
//		Character c= new Character("A");
		Character c= new Character('A'); // char형만 가능!!
//		Character c= new Character(65);
		
		Long l = new Long(12);
		Long l2 = new Long("12");
		
		Boolean b = new Boolean(false);
		/*
		 * 대소문자 상관없이
		 * T R U E  만 있다면 true
		 * 나머지 전부 false
		 * 
		 */		
		Boolean b2 = new Boolean("");//false
		Boolean b3 = new Boolean("trUE");//true
		
		
		
		
	}//main() end

}//Ex2 end
