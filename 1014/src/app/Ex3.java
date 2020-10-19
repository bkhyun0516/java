package app;


import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("등록할 그룹명은?");
		String name = scan.nextLine();
		System.out.println("데뷔일은?");
		System.out.println("예) 2020-10-14 형식으로");
		String debutDateStr = scan.nextLine();
		scan.close();
		
		SqlSession session = SqlSessionUtil.getSession();
		Group group = new Group(name,Date.valueOf(debutDateStr));

		int result = session.insert("groups.insert", group);
		System.out.println(result + "개 입력");
	}

}
