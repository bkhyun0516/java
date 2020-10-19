package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex6 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT group_id, name, debut_date FROM groups ORDER BY 1";
		try {
			con= ConnectionUtil.getConnection();
			stmt=con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+") "+ rs.getString(2) +" /데뷔일 "+ rs.getDate(3));
			}
			
		}catch (Exception e) {
			//개발자가 에러가 보여야
			//디버깅이 가능하기 때문에
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}//if end;
			}catch (Exception e) {
				e.printStackTrace();
			}//catch end
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}//catch end
			try {
				if(con!=null) {
					con.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}//try~catch~finally end

	}//main() end

}//Ex6
