package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection() throws Exception {
		return getConnection("test");
	}
	public static Connection getConnection(String user) throws Exception {
		Connection con=null;
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String password ="1111";
		con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
