package exception;

public class Ex6 {

	public static void main(String[] args) /*throws Exception */{
		throw new RuntimeException();//예외 강제로 발생
		/*
		 * RuntimeException을 상속받는
		 * Exception들은 예외 처리할 필요가 없음
		 * 
		 * 
		 * 반대로 나머지 모든 Exception들은
		 * 반드시 예외처리 해줘야 함.
		 * 
		 * 문법상으로는 안해도 되지만
		 * 결론은 해야된다. 
		 * 
		 */
//		throw new Exception();
		
		
	}// main() end

}
