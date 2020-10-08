package oop;

public class OverridingEx3 {

	public static void main(String[] args) {
		Object o = new Object();
//		String o = new String("TEST");
		
		System.out.println(o);//내부적으로 toString을 호출하기 때문에
		System.out.println(o.toString());// 두개가 같은 코드~
		
		
		Object s = new String("TEST");
		String s2 = new String("TEST");
	}

}
