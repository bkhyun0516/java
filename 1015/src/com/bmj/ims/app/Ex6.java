package com.bmj.ims.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.dao.GroupsDAO;
import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Group;
import com.bmj.ims.vo.Idol;




public class Ex6 {

	public static void main(String[] args) {
		//유저가 콘솔에 입력하는 데이터를 입력받기위해
				//스캐너 객체 생성
				Scanner scan = new Scanner(System.in);
				System.out.println("🎈🎈🎈아이돌 입력 프로그램🎈🎈🎈");
				System.out.println("이름?");
				//이름 입력받음
				String name = scan.nextLine();
				System.out.println("키?");
				//키를 입력받고
				//double형으로 형변환
				double height = Double.parseDouble(scan.nextLine());
				System.out.println("몸무게?");
				//몸무게를 입력받고
				//double형으로 형변환
				double weight = Double.parseDouble(scan.nextLine());
				System.out.println("생년월일?");
				System.out.println("예) 2020-10-14 형식으로");
				//생년월일을 입력받고
				//Date 형으로 형변환
				Date birthDate = Date.valueOf(scan.nextLine());
				System.out.println("성별?");
				System.out.println("예) 남자면 M/ 여자면 F");
				//성별을 입력받고
				//char형으로 형변환
				char gender = scan.nextLine().charAt(0);
				List<Group> groups = GroupsDAO.selectList();
				System.out.println("그룹 이름(번호로 입력해주세요)?");
				for (Group group : groups) {
					System.out.println(group.getGroupId() + ") "+ group.getName());
				}
				//그룹 번호를 입력받고
				//Integer형으로 형변환
				int groupId = Integer.parseInt(scan.nextLine());
				Idol idol=new Idol(gender,groupId,height,weight,name,birthDate);
				int result = IdolsDAO.insert(idol);
				System.out.println(result +"개 입력");

	}

}
