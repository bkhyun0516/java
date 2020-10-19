package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisApp2 {

	public static void main(String[] args) throws Exception {
Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
		
		SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = sb.build(reader);
		
		//SqlSession 중요
		SqlSession session = factory.openSession(true);
		int result = session.insert("idols.insert");
		System.out.println(result + "개 삽입");

	}

}
