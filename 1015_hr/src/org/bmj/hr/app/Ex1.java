package org.bmj.hr.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.dao.EmployeesDAO;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Employee;

public class Ex1 {

	public static void main(String[] args) {
		
		List<Employee> employees = EmployeesDAO.selectList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}//main end

}
