package collection;

import java.util.ArrayList;
import java.util.List;


public class Ex3 {
	
	/*
	 * 
	 * 제네릭은 자료형을
	 * 고정시키는 목적으로 사용됨
	 * 
	 * <자료형>
	 * 
	 * 
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("아이린");
//		list.add(3);
		list.add("예리");
		list.add("조이");
		list.add("슬기");
		list.add("웬디");
		for(Object o : list) {
			String s = (String) o;
			System.out.println(s.substring(1));
		}//for end
		
		
	}//main()

}
