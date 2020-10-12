package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은 ?");
		String name = scan.nextLine();
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="test";
		String password="1111";
		Connection con =
				DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		String sql = "DELETE FROM idols "
					+"WHERE name = '"
					+ name +"'";
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"명이 삭제되었습니다.");

	}

}
