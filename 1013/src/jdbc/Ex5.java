package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
//		Scanner scan =  new Scanner(System.in);
//		int num = scan.nextInt();
//		System.out.println(num);
//		scan.close();
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="test";
		String password="1111";
		Connection con = null;
		Statement stmt = null;
		String sql ="INSERT INTO groups(group_id,name,debut_date) VALUES(5,'시스타','2016-06-03')";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result +"개 입력");
		}catch (Exception e) {			
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}//if ~ end	
			}catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(con!=null) {
					con.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
