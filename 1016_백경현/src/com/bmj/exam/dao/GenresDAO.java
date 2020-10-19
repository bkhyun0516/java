package com.bmj.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.bmj.exam.util.SqlSessionUtil;
import com.bmj.exam.vo.Genre;


public class GenresDAO {
	
	public static int insert(String name) {
		int result = 0;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("genres.insert",name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return result;
	}
	public static int update(Genre genre) {
		int result = 0;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.update("genres.update",genre);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return result;
	}
	public static int delete(String name) {
		int result = 0;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.delete("genres.delete",name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return result;
	}
	public static List<Genre> selectList() {
		List<Genre> genres = null;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			genres = session.selectList("genres.selectListOrderByName");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return genres;
	}
	public static List<Genre> selectListNo() {
		List<Genre> genres = null;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			genres = session.selectList("genres.selectListOrderByNo");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return genres;
	}
	public static List<Genre> searchNo(int num) {
		List<Genre> genres = null;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			genres = session.selectList("genres.selectListNo",num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return genres;
	}
	
	
}
