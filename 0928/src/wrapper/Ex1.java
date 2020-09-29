package wrapper;

public class Ex1 {

	public static void main(String[] args) {
		
		
	/*
	 *  Wrapper클래스
	 * - 기본자료형을 객체자료형처럼
	 * 	 사용하기 위해 필요한 클래스들
	 * 
	 * Boolean
	 * Character
	 * Byte
	 * Short
	 * Integer
	 * Long
	 * Float
	 * Double
	 * 
	 * 
	 * - 기본자료형에 필요한 메서드나
	 * 	 상수등을 가지고 있는 클래스	 
	 * 
	 * - 자바 5(1.5)에서 변경된 부분
	 * 
	 * - 생성자(기본자료형 or String)
	 * 
	 */
	
	Integer i = new Integer(3);
	Integer i2 = new Integer("3");
//	Integer i3 = new Integer("A");//NumberFormatException
	/*
	 * A를 숫자로 형변환 할수 없으니까
	 * NumberFormatException이 발생
	 */
//	System.out.println(i);
//	System.out.println(i2);
	
//	String -> int형으로 변환하는 메서드
	//Integer.parseInt(문자열)
	int a = Integer.parseInt("33");
	//-> public static int parseInt(String s){}
	System.out.println(a);
	int max = Integer.MAX_VALUE;
	//->public static final int MAX_VALUE= 값; //final 지정하면 상수
	System.out.println(max);
	Long lMax = Long.MAX_VALUE;
	System.out.println(lMax);
	
	
	Double d = new Double(3.4);
	Double ds = new Double("3.4");
	Float f = new Float(3.4);//안에서 float으로 강제형변환
	Float fs = new Float("3.4");
//	Float fs2 = new Float("3.4a");//NumberFormatException
	
	Boolean bf = new Boolean(false);
	Boolean bt = new Boolean(true);
	/*
	 * Boolean의 생성자의 인자 String은
	 * 대소문자 안가리고 T,R,U,E 만
	 * true고 나머지는 false
	 * (익셉션이 안남)
	 * 
	 */
	Boolean bs = new Boolean("TrUE");
	System.out.println(bs);
	
	
	
	}//main end

}//Ex1 end
