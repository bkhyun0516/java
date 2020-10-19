package com.bmj.ims.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.util.SqlSessionUtil;
import com.bmj.ims.vo.Idol;

public class IdolsDAO {
	public static List<Idol> selectList(){
		List<Idol> idols = null;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			idols = session.selectList("idols.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}
		return idols;
	}
	public static List<Idol> selectListName(){
		List<Idol> idols = null;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			idols = session.selectList("idols.selectListName");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}
		return idols;
	}
	public static int insert(Idol idol){
		int result = 0;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("idols.insert",idol);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}
		return result;
	}
	public static int update(Idol idol){
		int result = 0;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.update("idols.update",idol);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}
		return result;
	}
}
