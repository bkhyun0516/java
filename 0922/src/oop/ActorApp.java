package oop;

public class ActorApp {
	/*
	 * 객체는 아는것과 하는것 을 가지고 있음
	 * 아는 것은 속성이고 품사로 보면 명사
	 * 하는 것은 기능이고 품사로 보면 동사
	 * 
	 * 자바는 클래스기반 객체지향언어
	 * 
	 * 클래스는 객체의 설계도이자 자료형
	 * 
	 * 
	 * 클래스에는 아는 것은 멤버필드
	 * 클래스에서 하는 것은 (멤버)메서드
	 * 
	 * 클래스는 멤버필드와 메서드를 가지고 있다.
	 *  	== 클래스의 멤버는 필드와 메서드이다
	 */
	
	public static void main(String[] args) {
					//Actor클래스 생성자를 호출
					//하여 객체를 생성(힙메모리에...)
		//stack영역에서 사용하기 위해서 
		// 레퍼런스(객체와의 연결선)를 변수에 담는다.
		Actor a1= new Actor();
		// Actor형 star라는 지역변수를 선언하고 
		// Actor객체를 생성한 뒤
		// star에 대입
		a1.name="김슬기";
		// '.': 레퍼런스 접근 연산자
		a1.height=157;
		a1.gender='F';
		a1.debut="넌 내게 반했어";
		System.out.println("이름 : "+a1.name);
		System.out.println("키 : "+a1.height);
		System.out.println("성별 : "+a1.gender);
		System.out.println("데뷔작 : "+a1.debut);
		//지역변수 선언 과 Actor 객체 생성
		Actor a2= new Actor();
		/*
		 * new Actor(); 만 적었을시
		 * 다음 줄부터는 해당 객체에 대한
		 * 레퍼런스가 없어서 객체에 접근할수 없다.
		 */
		a2.name = "최민식";
		a2.height= 177;
		a2.gender='M';
		a2.debut="야망의 세월";
		System.out.println("이름 : "+a2.name);
		System.out.println("키 : "+a2.height);
		System.out.println("성별 : "+a2.gender);
		System.out.println("데뷔작 : "+a2.debut);
		//a3 변수 선언후 Actor객체 생성
		Actor a3= new Actor();
		a3.name="김래원";
		a3.gender='M';
		a3.height=184;
		a3.debut="나";
		System.out.println("이름 : "+a3.name);
		System.out.println("키 : "+a3.height);
		System.out.println("성별 : "+a3.gender);
		System.out.println("데뷔작 : "+a3.debut);
		System.out.println(a3);
		System.out.println(a2);
		System.out.println(a1);

		
	}//main() end
}//ActorApp end
