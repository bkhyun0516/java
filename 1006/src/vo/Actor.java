package vo;

public class Actor {

	private String name;
	private int height, weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Actor() {
	}
	public Actor(String name,int height, int weight) {
		this.name= name;
		this.height= height;
		this.weight= weight;
	}
	//toString 메서드재정의(Overriding)
	@Override
	public String toString() {
		String s= "";
		s = "이름: "+ getName()
		+ " / 키 : " + this.getHeight()
		+ "cm / 몸무게 : " + this.getWeight() + "kg";
		return s;
	}
	/*
	 * 메서드 선언 초급방법
	 * 
	 * 첫번째 줄에 리턴자료형과
	 * 동일한 지역변수를 선언후
	 * 초기화 함 
	 * 
	 * 마지막 줄에 리턴 키워드 지역변수 선언
	 */
	
	
	// equals 메서드 재정의(Overriding)
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(this == obj) {
			return true;//인스턴스가 같은 경우
		}//if end
		if(obj instanceof Actor) {
			Actor ac = (Actor) obj;
			return name.equals(ac.name) && height == ac.height && weight == ac.weight;
//			return name == ac.name && height == ac.height && weight == ac.weight;
		
		}
		return flag;
	}
}
