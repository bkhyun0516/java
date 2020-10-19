package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(9);
		set.add(15);
		set.add(50);
		set.add(1);
		System.out.println(set);
		System.out.println(set);
		
		Set<Integer> setT = new TreeSet<Integer>();
		setT.add(9);
		setT.add(15);
		setT.add(50);
		setT.add(1);
		System.out.println(setT);
		
	}
	
	
}
