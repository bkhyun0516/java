package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex7 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT idol_id, name FROM idols ORDER BY 1";
		try {
			con = ConnectionUtil.getConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+") "+rs.getString(2));
			}//while end	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {rs.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch
			try {
				if(stmt!=null) {stmt.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch
			try {
				if(con!=null) {con.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch
		}//try~catch~finally

	}//main end

}
