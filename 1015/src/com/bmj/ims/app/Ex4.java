package com.bmj.ims.app;

import java.util.Scanner;

import com.bmj.ims.dao.GroupsDAO;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 그룹번호?");
		int no = scan.nextInt();
		int result = GroupsDAO.delete(no);
		System.out.println(result+"개의 그룹이 해체되었습니다.");
	}

}
