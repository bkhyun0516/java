package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisApp1 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
		
		SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = sb.build(reader);
		
		//SqlSession 중요
		SqlSession session = factory.openSession(true);
//		session.delete("네임스페이스.아이디");
		int result = session.delete("groups.delete");
		System.out.println(result + "개 삭제");
		
	}//main end()

}
