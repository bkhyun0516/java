package oop;

public class OverridingEx2 {
	public static void main(String[] args) {
		Object o = new String("TEST");
		Object o2 = new String("TEST");
		System.out.println(o.equals(o2));
		// 오버라이딩으로 equals가 레퍼런스(같은 인스턴스인가?) 비교에서
		//  값비교로 바뀌여 true이다.
		String s = new String("TEST");
		String s2 = new String("TEST");
		System.out.println(s.equals(s2));
		
	}//main() end

}//OverridingEx2 end
