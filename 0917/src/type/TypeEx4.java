package type;

public class TypeEx4 {
//	컨트롤 스페이스 자동완성
	public static void main(String[] args) {
		/*
		 *  자바의 기본자료형 char형
		 *  - 문자형 (글자 한글자)
		 *  - ''(""은 String형)
		 *  - 내부적으로 정수처리
		 * 	- 2byte
		 *  - 0~65535
		 *  - 유니코드 한글자마다 대응하는 숫자(양수)가 있다
		 *  	=>ASCII(American Standard Character Infomation Interchange) 코드(7비트: 0~127) 
		 *  		=> 확장된 ASCII코드가 8비트
		 *  - 최초의 유니코드 2byte(0~65535)
		 *  - 0 <-48
		 *  - A <-65
		 *  - a <-97
		 *  - 엔터값 <- 13
		 *  - '\u0000' '\uffff' 16진수로 표기가능
		 *  - 
		 *  -
		 */
		// 기본자료형 char형 지역변수 c를 선언
		char c;
		// 지역변수 c에 문자 'a'를 대입(초기화)
		c = 'a';
		c = 65;//'A'
		
		//syso 후 ctrl+space으로 자동완성 가능
		System.out.println(c);
		
		// ' 표기하려면
		// \'로 표기
		c='\'';
		System.out.println(c);
		
		char veck= '뷁';
		System.out.println(veck+0);
		// 유니코드로 16진수 표기 가능
		char uc = '\u00a3';
		System.out.println(uc);
		
		
	}// 메인 엔드
}
