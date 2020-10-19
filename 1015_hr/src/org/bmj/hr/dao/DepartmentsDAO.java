package org.bmj.hr.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Department;

public class DepartmentsDAO {

	public static List<Department> selectList() {
		List<Department> departments =null;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			departments = session.selectList("departments.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return departments;
	}

}
