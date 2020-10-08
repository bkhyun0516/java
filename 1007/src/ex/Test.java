package ex;

public class Test {
	int num;
	
	
	public Test() {
	}
	public Test(int a) {
		
		this.num = a;
	}
	@Override
	public String toString() {
		return "숫자 " + num + " : "+(num%2==0?"짝":"홀") + "수입니다.";
	}
	
	void test(int a) {
		System.out.println("인트");
	}
	void test(char a) {//지우면 int형이 되겟지(자동형 변환 될 수 있는 놈 찾는다)
		System.out.println("챠");
	}
	void test(Object a) {
		System.out.println("오브젝트");
	}
	public static void main(String[] args) {
		Test t = new Test(7);
		t.test('A');
		int a ='A';// char to int 자동형변환 가능하다!
		t.test(t);
		Object o = t;// Test to Object 자동형변환 가능하다.
		/*
		 * 인자로 들어갈때 자동형변환 가능하다면
		 * 들어갈 수 있다.
		 * 
		 */
		Object[] obj = new Object[3];
		obj[1] ="트래쉬";
		obj[2]="가비지";
		for (Object ob : obj) {
			System.out.println(ob);
		}
		System.out.println(t);
	}

}
