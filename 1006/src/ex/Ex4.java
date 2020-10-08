package ex;
class A2{
	
}
public class Ex4 {
	private static Object test(A2 a) {
		return a;
	}
	public static void main(String[] args) {
		A2 a = (A2)test(null);
		Object[] o  = {new Ex4(),"3",3};
	}
	

}
