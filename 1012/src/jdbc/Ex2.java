package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		//1) 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		//1.5) 커넥션 데이터
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user="test";
		String password="1111";
		//2) 커넥션 객체 얻기
		
		Connection con =
				DriverManager.getConnection(url, user, password);
		//3) 구문객체 생성
		Statement stmt = con.createStatement();
		//4) SQL 작성
		String sql = "INSERT INTO idols"
				+ "(idol_id,name,height,weight,birth_date,gender,group_id)"
				+"VALUES(10,'효정',158,42,'1994-07-28','F',4)";
//		String sql2 ="INSERT INTO idols"
//		+ "(idol_id,name,height,weight,birth_date,gender,group_id)"
//		+"VALUES(11,'효정',158,42,'1994-07-28','F',4)";
		
		//5) 결과 출력
		int result = stmt.executeUpdate(sql);
//		result = stmt.executeUpdate(sql2);
		System.out.println(result);
	}

}
