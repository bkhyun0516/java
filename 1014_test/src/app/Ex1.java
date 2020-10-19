package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은?");
		String name = scan.nextLine();
		scan.close();
		SqlSession session = SqlSessionUtil.getSession();
		int result = session.delete("idols.deleteByName", name);
		System.out.println(result +"개 삭제");
	}

}
