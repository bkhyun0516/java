package string;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email;
		while(true) {
			System.out.println("당신의 이메일을 입력하세요~!");
			//입력받음
			email = scan.nextLine();
			if(email.contains("@")) {
				break;
			}else {
				System.out.println("양식에 맞지 않습니다~");
			}
		}
		int idx = email.indexOf("@");
		String id = email.substring(0, idx);
		// 이메일중 아이디만 추출하여 출력
		System.out.println("당신의 아이디는 "+id+"입니다.");
	}

}
