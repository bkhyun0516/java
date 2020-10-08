package test;

public class Test {
	private int a;
	public Test() {
	}
	public Test(int a) {
		this.a = a;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;	
		}
		if(obj instanceof Test) {
			Test tmp = (Test) obj;
			return this.a==tmp.a;
		}
		else {
			return false;
		}
	}
}
