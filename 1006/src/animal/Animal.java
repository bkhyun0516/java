package animal;

public abstract class Animal {//추상클래스
	String name;
	String species;
	int age;
	double weight;
	
	
	/*
	 * 추상의 키워드:abstract
	 * 
	 * - 추상클래스
	 * 
	 * - 선언:  접근제한자 abstract class 클래스
	 * 
	 * - 일반클래스처럼 생성자도 가지고, 
	 * 	 일반 메서드도 가질수 있고,
	 *   멤버필드도 가질 수 있음
	 *   
	 * - 단! new 생성자 호출로 객체생성 불가!
	 * 
	 */
	
	/*
	 * - 추상메서드
	 * 
	 * - "본체(body:{})"가 없는 메서드
	 * - 호출은가능하지만 내용이 없음
	 * - 선언:  접근 제한자 abstract (static)
	 *  		리턴자료형 메서드명(인자);
	 *  
	 *  - 추상메서드를 가진 추상클래스를
	 *    상속받으면 반드시 추상메서드를
	 *    overriding 해야함 
	 *  
	 *  
	 *  추상클래스는 반드시 추상메서드를 가질 필요는 없지만
	 *  추상메서드는 반드시 추상클래스에 위치해야 합니다!
	 *  
	 * 
	 */
	public abstract void cry();//cry() end //(추상메서드)
}
