package animal;

public class Chicken extends Animal{
	/*
	 * 상속 받은 추상메소드를 구현하지 않아서 에러
	 */
	@Override
	public void cry() {
		System.out.println("바삭바삭");
		
	}
	
}
