package exception;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0);//예외 발생시 이하 실행 안하고 catch문으로
			System.out.println(5);
		}catch(Exception e) {//예외마다 다른 catch 작성가능(여러개 사용가능하다)
			//예외 발생했을 때에만 작동
			System.out.println(6);
		}//try~catch end
		System.out.println(7);
	}
}
