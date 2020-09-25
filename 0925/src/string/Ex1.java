package string;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * String 메서드들은
		 * 절대 원본 문자열을 훼손하지 않는다.
		 * 
		 * 리턴값을 위한 객체를 명시적으로 새로 만들어서
		 *  리턴해준다.
		 * 
		 */
		
		
		String s = "ABCD";
		/*
		 * String의 주요 메서드
		 * - charAt(인덱스) :
		 * 		문자(char형) 하나를 리턴하는 메서드
		 */
		char c = s.charAt(0);
		System.out.println(c);//A
		
		/*
		 * concat : 문자열 더하기 연산
		 * '+' 로 대체 가능
		 */
		String s2 = "ab";
		s = s.concat(s2);
		System.out.println(s);
		s += s2;
		System.out.println(s);
		
		/*
		 * 문자열.contains(인자) : 인자가 문자열에 포함되었는지 \
		 * 				논리 값으로 알려준다.
		 * 
		 */
		System.out.println(s.contains("ab"));
		
		/*
		 * equals : 값비교
		 * 
		 */
		
		/*
		 * String의 주요 메서드2
		 * 
		 * - indexOf(문자)
		 * 	: 해당문자의 인덱스값 반환
		 * 		단 , 없으면 -1을 반환
		 * 
		 * - lastIndexOf(문자) :
		 * 뒤에서부터 만나는
		 * 첫번째 문자의 index 값 리턴
		 * 없으면 -1
		 */
		String a = "오우오우오바메양가봉맨";
		int idx = a.indexOf("가봉나봉");
		System.out.println(idx);
		idx = a.indexOf("오");
		System.out.println(idx);
		idx = a.lastIndexOf("오");
		System.out.println(idx);
		
		
		/*
		 * isEmpty(): 문자열 길이 0?
		 */
		
		
		
		
		
	}//main ()
}











