package constructor;

import vo.Member;

public class ClubApp {
	public static void main(String[] args) {
		// 한 멤버에 대한 정보
		Member m1 = new Member("최민식",'M');
		
//		m1.setName("최민식");
//		m1.setCode("20학번");
//		m1.setGender('F');
//		m1.setMajor("컴퓨터공학");
		
		System.out.println(m1.getName());
		System.out.println(m1.getCode());
		System.out.println(m1.getGender());
		System.out.println(m1.getMajor());
		
		Member m2 = new Member("이근","20학번",'F',"국문학");
		System.out.println(m2.getName());
		System.out.println(m2.getCode());
		System.out.println(m2.getGender());
		System.out.println(m2.getMajor());
		Member m3 = new Member("이선균","14학번",'M');
		System.out.println(m3.getName());
		System.out.println(m3.getCode());
		System.out.println(m3.getGender());
		System.out.println(m3.getMajor());
		Member m4 = new Member("리신");
		System.out.println(m4.getName());
		System.out.println(m4.getCode());
		System.out.println(m4.getGender());
		System.out.println(m4.getMajor());
	}//main end

}//class end
