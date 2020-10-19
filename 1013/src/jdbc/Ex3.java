package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex3 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "test", "1111");
		Statement stmt = con.createStatement();
		String sql ="SELECT idol_id, name, height, weight, birth_date, gender, group_id FROM idols ORDER BY 1";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int idolId = rs.getInt(1);
			String name = rs.getString(2);
			double height = rs.getDouble(3);
			double weight = rs.getDouble(4);
			Date birthDate = rs.getDate(5);
			char gender = rs.getString(6).charAt(0);
			int groupId = rs.getInt(7);
			System.out.println(
					idolId + ") 이름: "+
					name + " 키 :" +
					height + " 몸무게 : "+
					weight + " 생일 : " +
					birthDate + " 성별 : "+
					gender + " 그룹아이디: "+
					groupId);
			
		}
	}

}
