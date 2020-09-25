package vo;

public class Member {
	//아무것도 안쓰고 ctrl+space 치면 기본생성자 생성
	
	/*
	 * 생성자는 멤버필드의 초기화
	 * 
	 *  기본생성자도 만들어야 한다.
	 * 
	 * 
	 */
	public Member() {}
	public Member(String name,String code,char gender,String major) {
		this.name = name;
		this.code = code;
		this.gender = gender;
		this.major = major;
	}
	public Member(String name,String code, char gender) {
		this(name,code,gender,"컴퓨터공학");//무조건 첫줄에 써야한다
											//왜? 생성자니까!
											//일단 객체 만들고 뭘하여라~
	}
	public Member(String name, char gender) {
		this(name,"20학번",gender);
	}
	public Member(String name) {
		this(name,'M');
	}
	
	
	private String name;//이름
	private String code;//학번
	private char gender;//성별(M,F)
	private String major;//전공
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}