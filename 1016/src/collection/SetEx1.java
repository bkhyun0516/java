package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		/*
		 * SET
		 * HashSet :  정렬 안됨
		 * TreeSet :  정렬가능(같은 자료형끼리)
		 * 
		 * 중복이 없다
		 */
		
		
		Set s = new HashSet();//set,map,list는 객체자료형만 들어간다 
		s.add(3);			//오토박싱 된것이다.
		s.add("1");
		s.add("나");
		s.add(new SetEx1());
		System.out.println(s.size());
		s.add(3);
		System.out.println(s.size());
		s.add(1);
		System.out.println(s.size());
		System.out.println(s.toString());
		for(Object o: s) {
			// 순서 없어서 넣은 순서대로 나오지 않는다
			System.out.println(o);
		}//for end
		
		};//클래스 선언 및 생성 하는 코드 다른 곳에서는 못쓴다.
		
		/*
		 *  Collection의 대표적인 종류
		 *  - Set : 인덱스 X	중복허용 X
		 *  	주요 구현체 : HashSet, TreeSet
		 *  	
		 *  
		 *  
		 *  - Map : 인덱스 X 	중복허용 O
		 *  - List: 인덱스 O	중복허용 O
		 * 
		 */
//		Set set = new Set() {
//			@Override
//			public int size() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//
//			@Override
//			public boolean isEmpty() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public boolean contains(Object o) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public Iterator iterator() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public Object[] toArray() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public Object[] toArray(Object[] a) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public boolean add(Object e) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public boolean remove(Object o) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public boolean containsAll(Collection c) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public boolean addAll(Collection c) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public boolean retainAll(Collection c) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public boolean removeAll(Collection c) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public void clear() {
//				// TODO Auto-generated method stub
//				
//			}
//		
//		}


}
