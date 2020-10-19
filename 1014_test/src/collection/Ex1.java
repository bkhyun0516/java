package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 
		 * Collection객체들은
		 * 객체의 레퍼런스를 수집하는 객체니까
		 * 배열처럼 여러 객체를 가지고 있는
		 * 느낌의 객체이다.
		 * 
		 * List :  무한배열같은 느낌 (인터페이스)
		 * - 인덱스가 있다!!!
		 * - 주요 구현 클래스 : Vector, ArrayList
		 * - 주요메서드
		 * 
		 * 	add() : 리스트에 객체 추가
		 *  size() : 객체의 개수
		 *  get(인덱스) : 해당인덱스의 레퍼런스 얻어온다.  
		 *  
		 *  
		 */
		List list= new ArrayList();
		list.add(1);
		list.add("3");
		list.add("6");
		list.add("6");
		list.add("후후후");
		System.out.println(list.size());
		System.out.println(list);//[1, 3, 6, 6, 후후후] 출력
//		일반 for문
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}//for end
//		for each
		for(Object o : list) {
			System.out.println(o);
		}
		
	}//main end()
}//Ex1 end()
