package constructor;

public class Ex1 {
	
	public Ex1() {
		System.out.println("?");
		System.out.println();
	}
	
	public Ex1(int a) {
		for(int i=0; i<a;i++) {
			System.out.println("?");
		}
		System.out.println();
	}
	/*
	 * 생성자의 선언
	 * 
	 * 접근제한자 클래스명(인자) {}
	 * 
	 * 
	 * 생성자는 리턴자료형 없다!!!
	 * 	--> 리턴값이 무조건 레퍼런스 값이기 때문에
	 *
	 * 생성자명은 클래스명과 같아야한다!
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		new Ex1();
		//Ex1의 기본생성자를 호출하는 코드
		Ex1 e = new Ex1(2);//
	
		
		

	}// main() end

}
