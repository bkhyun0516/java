package animal;

public class AHApp {

	public static void main(String[] args) {
		Animal[] rooms = new Animal[5];
		/*
		 * Object[] rooms도 가능하나 Animal의 멤버를 표기해
		 * 주지 않기 때문에 Animal[]로 하자
		 * 
		 */
		rooms[0] = new Dog();
		rooms[1] = new Cat();
		rooms[2] = new Snake();
		rooms[3] = new Crocodile();
		rooms[4] = new Fox();
		
//		for(int i=0; i< rooms.length; i++) {
//			if(rooms[i] instanceof Dog) {
//				Dog d = (Dog)rooms[i];
//				d.cry();
//			}else if(rooms[i] instanceof Cat) {
//				Cat c = (Cat)rooms[i];
//				c.cry();
//			}else if(rooms[i] instanceof Snake) {
//				Snake s = (Snake)rooms[i];
//				s.cry();
//			}else if(rooms[i] instanceof Crocodile) {
//				Crocodile cr = (Crocodile)rooms[i];
//				cr.cry();
//			}else if(rooms[i] instanceof Fox) {
//				Fox f = (Fox)rooms[i];
//				f.cry();
//			}//if ~ else if end 	
//		}

		
		for(Animal ani : rooms) {
			ani.cry();
		}//for end;
	}

}
