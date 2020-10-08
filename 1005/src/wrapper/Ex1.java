package wrapper;

public class Ex1 {

	public static void main(String[] args) {
		Integer i = new Integer(4);
		Integer i2 = new Integer("4");
		Integer i3 = new Integer("4");
		
//		Integer ij = new Integer("afafaa");//에러
		System.out.println(i2==i3);//false
		
		/*
		 * Wrapper 클래스 들
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
		 * 1) 기본자료형을  => 객체자료형으로 사용하려고 
		 * (컬랙션(객체자료형이 들어가야한다.기본자료형 못쓴다.) 때문에)
		 * 
		 * 2) 기본 자료형에
		 * 대한 메서드, 상수를 가지고 있음
		 * 
		 * - 생성자
		 * 
		 *  생성자(해당기초자료형)
		 *  생성자(String형) -> Character형만 예외
		 */
		

	}//main() end

}
