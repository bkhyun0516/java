package string;

public class Ex4 {

	public static void main(String[] args) {
		String s = "A";
		String s1 =s;
		s += "B";
		String s2 =s;
		s += "C";
		String s3 =s;
		s += "D";
		String s4 =s;
		System.out.println(s);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		/*
		 * string 객체는 불변함
		 * 
		 * 따라서 객체낭비가 심한 편이다.
		 * 속도는 빠르긴 하다
		 * 
		 * 객체 낭비를 개선하기 위해서
		 * StringBuffer, StringBuilder를 사용함
		 * 
		 * java 5부터는 객체 낭비가 심해지면
		 * 컴파일시에 자동 변환 해주기도 한다.
		 * (개수 따라 다르다~)
		 * (s -> sb -> 처리 -> sb -> s);
		 * 
		 * StringBuilder는 자바5(1.5)에
		 * 추가됨: 속도가 빠름
		 * 
		 * StringBuffer는 쓰레드에 안전하기
		 * 때문에 속도가 느림
		 * 
		 * StringBuffer와 StringBuilder의 차이는
		 * 멀티쓰레드 환경에서는
		 * StringBuffer를 사용하고
		 * 싱글쓰레드에서
		 * StringBuilder를 사용
		 * 
		 */	
		StringBuilder sb = new StringBuilder("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		
		System.out.println(sb.toString());	//같은
		System.out.println(sb);				//기능
		//(메서드 내부에서 toString 해줌)
		String str = sb.toString();
		System.out.println(str);
	}
}
