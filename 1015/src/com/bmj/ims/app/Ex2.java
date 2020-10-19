package com.bmj.ims.app;

import java.util.List;

import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Idol;

public class Ex2 {

	public static void main(String[] args) {
		List<Idol> idols = IdolsDAO.selectList();
		for (Idol idol : idols) {
			System.out.println(idol);
			System.out.println(idol.getGroupName());
		}
		idols = IdolsDAO.selectListName();
		for (Idol idol : idols) {
			System.out.println(idol);
			System.out.println(idol.getGroupName());
		}
	}

}
