package org.bmj.hr.util;

import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	public static SqlSession getSession() {
		try {
			Reader reader = Resources.getResourceAsReader("org/bmj/hr/config/mybatis-config.xml");
			SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = sb.build(reader);
			return factory.openSession(true);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}//try~catch
	}	
}
