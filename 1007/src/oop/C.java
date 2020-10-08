package oop;
/*
 * 
 * 	클래스 						인터페이스
 * 						 ↗
 *    ↑								↑
 * 	(상속)		  	↗	    	 (상속)
 *  extends		  (구현) 		 extends
 * 			   ↗(implements)
 * 	클래스						인터페이스
 * 
 */
public class C implements A,B{

	
	
	/*
	 * 
	 *  추상 클래스를 상속하거나,
	 *  인터페이스를 구현 했을 때
	 *  만약 추상 메서드가 있으면
	 *  무조건 구현 해야 합니다!
	 * 
	 * 
	 */
	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
