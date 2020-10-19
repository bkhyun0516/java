package com.bmj.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.exam.util.SqlSessionUtil;
import com.bmj.exam.vo.Movie;

public class MoviesDAO {

	public static int delete(int no) {
		int result = 0;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.delete("movies.delete",no);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return result;
	}
	public static int insert(Movie movie) {
		int result = 0;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("movies.insert",movie);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return result;
	}
	
	public static List<Movie> selectNameList() {
		List<Movie> movies = null;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			movies = session.selectList("movies.selectNameList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return movies;
	}
	
	
	public static List<Movie> search(String word) {
		List<Movie> movies = null;
		SqlSession session =null;
		try {
			session = SqlSessionUtil.getSession();
			movies = session.selectList("movies.search",word);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) {
				session.close();
			}
		}//try~ catch~ finally
		return movies;
	}
	
}
