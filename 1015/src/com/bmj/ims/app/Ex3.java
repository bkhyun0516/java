package com.bmj.ims.app;

import java.sql.Date;
import java.util.Scanner;

import com.bmj.ims.dao.GroupsDAO;
import com.bmj.ims.vo.Group;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력할 그룹명?");
		String name = scan.nextLine();
		System.out.println("데뷔일?");
		System.out.println("형식)YYYY-MM--DD");
		Date debutDate = Date.valueOf(scan.nextLine());
		Group group = new Group(name,debutDate); 
		int x = GroupsDAO.insert(group);
		System.out.println(x+"개의 그룹이 잘 등록되었습니다.");
		scan.close();
	}
}
