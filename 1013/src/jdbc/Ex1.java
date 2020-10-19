package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import util.ConnectionUtil;

public class Ex1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은?");
		String name = scan.nextLine();
//		1) 드라이버 로딩
//		Class.forName("oracle.jdbc.OracleDriver");//ClassNotFoundException 해야한다.
//		System.out.println("드라이버 로딩완료");
//		2)커넥션연결
//		String url ="jdbc:oracle:thin:@localhost:1521:xe";
//		String user="test";
//		String password ="1111";
		Connection con = ConnectionUtil.getConnection();// 만든 메소드를 이용
// 메소드에서 예외를 처리하지 않고 위임한다면
// 호출하는 곳에서도 처리를 하던가 위임해줘야한다.

		//		3) 구문객체생성
		Statement stmt = con.createStatement();
//		4) SQL 구문작성
		String sql = "DELETE idols "
				+ "WHERE name = '" + name + "'";//싱글 포테이션 잊지 말자
		System.out.println(sql);
//		5) 결과 수행
		int result =stmt.executeUpdate(sql);
		//insert, update, delete는
		//executeUpdate(SQL구문) -> int 형 반환
		System.out.println(result);
		//select
		//executeQuery(SQL 구문)-> SELECT 결과 반환
	}//main()

}//Ex1 end
