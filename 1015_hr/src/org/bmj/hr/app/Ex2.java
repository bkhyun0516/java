package org.bmj.hr.app;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.dao.EmployeesDAO;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Employee;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("검색할 이름?");
		String q = scan.nextLine();
		List<Employee> employees = EmployeesDAO.selectSearchName(q);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}//main end

}
