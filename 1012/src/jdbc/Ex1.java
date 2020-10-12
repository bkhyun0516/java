package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 자바와 데이터베이스 (오라클)을
 * 연동하는 방법
 * 
 * 1) JDBC(Java DataBase Connectivity)
 * - 순수자바
 * 
 * 2) mybatis
 * 
 * 3) hibernate(->JPA)
 * 
 */
public class Ex1 {

	public static void main(String[] args) throws Exception{
		
		/*
		 * JDBC 프로그래밍 순서
		 * 코딩전
		 * 0) 해당 프로젝트에 ojdbc(오라클 드라이버)를 
		 * 		add External jar로 등록
		 */
		//1) 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1) 드라이버 로딩완료");
		
		//1.5) 커넥션 연결용 데이터 설정
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		
		//2) 커넥션 객체 얻어오기
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2) 커넥션 객체 얻기!");
		
		//3) 구문객체 생성 (java.sql 임포트하자)
		Statement stmt = con.createStatement(); 
		//4) SQL 구문 작성
		String sql = "INSERT INTO groups"
				+"(group_id, name, debut_date)"
				+"VALUES(4, '룰라','1995-07-01')";
		
		//5) 수행 및 결과 얻어오기
		int result = stmt.executeUpdate(sql);
		
		System.out.println(result+ "개의 그룹 입력 완료");
		
	}

}
