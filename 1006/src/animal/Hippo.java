package animal;

public class Hippo extends Animal{
	/*
	 * 상속받은 추상클래스 Animal이 가진 
	 * 추상메서드 cry를 구현(오버라이딩, 메서드재정의) 하지 않으면
	 * 에러발생
	 * 
	 * 해결방법 
	 * 1) 구현한다(대부분)
	 * 2) 얘도 abstract 한다!: hippo.cry()를 호출 못하게
	 * 
	 */
	@Override
	public void cry() {
		System.out.println("크아아아악~!");
		
	}

}
