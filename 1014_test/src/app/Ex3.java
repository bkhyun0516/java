package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class Ex3 {

	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		Idol idol = session.selectOne("idols.selectOne");
		System.out.println(idol);
		System.out.println();
		List<Idol> idols = session.selectList("idols.selectList");
		for (Idol idol2 : idols) {
			System.out.println(idol2);
		}
	}

}
