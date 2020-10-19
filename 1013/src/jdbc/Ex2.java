package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;


public class Ex2 {

	public static void main(String[] args) throws Exception{
		//1) 드라이버 로딩
		//2) 커넥션 객체 얻기
		Connection con = ConnectionUtil.getConnection();

		//3)구문객체
		Statement stmt = con.createStatement();
		//4) SQL 작성
		// '*' 쓴다면 oracle이 일일이 속성을 다 읽어줘야 되므로 사용을 지양해야한다.
		String sql = "SELECT group_id, name, debut_date FROM groups ORDER BY 1";
//		String sql1 = "SELECT idol_id, name, height, weight, birth_date, gender, group_id FROM idols";
		
//		5) 수행후 결과 집합 얻기
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int groupId = rs.getInt(1);
			String name = rs.getString(2);
			Date debutDate = rs.getDate("debut_date");
			System.out.println(groupId+") " + name + "/데뷔일 "+ debutDate);
		}

	}//main end

}//Ex2 end
