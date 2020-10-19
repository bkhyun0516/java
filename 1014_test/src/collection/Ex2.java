package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List redVelvet = new ArrayList();
		redVelvet.add("아이린");
		redVelvet.add("슬기");
		redVelvet.add("웬디");
		redVelvet.add("조이");
		redVelvet.add("예리");
		for (int i = 0; i < redVelvet.size(); i++) {
			System.out.println(redVelvet.get(i));
		}
		for (Object o : redVelvet) {
			System.out.println(o);
		}
	}

}
