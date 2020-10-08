package vo;

public class ActorApp {
	public static void main(String[] args) {
		Object actor1 = new Actor("마동석",178,100);
//		actor1.setName("마동석");
//		actor1.setHeight(178);
//		actor1.setWeight(100);
		
		System.out.println(actor1.toString());
		System.out.println(actor1);
		
		
		Object actor2 = new Actor("로버트패틴슨",185,75);
//		System.out.println("이름: "+ actor2.getName()
//		+ " / 키 : " + actor2.getHeight()
//		+ "cm / 몸무게 : " + actor2.getWeight() + "kg");
		System.out.println(actor2);
		
		
		//원래는 Object가 가진 equals() 메서드
		//를 호출하기 때문에 당연히 == 비교
		// 레퍼런스 비교이기 때문에
		// false인데
		// 우리가 equals()메서드를 overriding
		//해서 이름 ,키 , 몸무게가 같으면
		// true가 되도록 합니다.-
		String mDS = new String("마동석");
		Object actor3 = new Actor(mDS,178,100);
		System.out.println(actor1.equals(actor3));
	}
}
