package com.bmj.ims.app;

import java.util.List;

import com.bmj.ims.dao.GroupsDAO;
import com.bmj.ims.vo.Group;

public class Ex1 {
	
	public static void main(String[] args) {
		List<Group> groups = GroupsDAO.selectList();
		for(Group group:groups) {
			System.out.println(group);
		}
	}//main()
	
}
