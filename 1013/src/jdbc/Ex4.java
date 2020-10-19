package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex4 {

	public static void main(String[] args) throws Exception{
		//커넥션 생성
		Connection con = ConnectionUtil.getConnection("hr");
		//구문객체 생성
		Statement stmt = con.createStatement();
		//SQL 구문 작성
		String sql = "SELECT employee_id, first_name, last_name, department_name " + 
				"FROM employees e, departments d " + 
				"WHERE e.department_id = d.department_id(+) " + 
				"ORDER BY 1";
		//수행 후 결과 집합 받기
		ResultSet rs = stmt.executeQuery(sql);
		//출력
		while(rs.next()) {
			int employeeId = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			String name = firstName + " " + lastName;
			String departmentName = rs.getString(4);
			System.out.println(employeeId + ") "+ name +" / 부서명 : " + departmentName);
		}
	}// main()

}
