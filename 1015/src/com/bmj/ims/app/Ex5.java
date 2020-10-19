package com.bmj.ims.app;

import java.util.Scanner;

import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Idol;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("수정할 아이돌 번호");
		int num = Integer.parseInt(scan.nextLine());
		System.out.println("수정할 아이돌 이름 입력");
		String name = scan.nextLine();
		Idol idol = new Idol(num,name);
		int result = IdolsDAO.update(idol);
		System.out.println(result + "개의 아이돌 이름이 수정됨");
		scan.close();

	}
}
