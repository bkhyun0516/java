package com.bmj.ims.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.util.SqlSessionUtil;
import com.bmj.ims.vo.Group;

public class GroupsDAO {
	
	public static List<Group> selectList() {
		List<Group> groups = null;
		SqlSession session = null;
		try {
			session= SqlSessionUtil.getSession();
			groups = session.selectList("groups.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}//try ~ catch ~ finally end
		return groups;
	}
	public static int insert(Group group) {
		int result=0;
		SqlSession session = null;
		try {
			session= SqlSessionUtil.getSession();
			result = session.insert("groups.insert",group);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}//try ~ catch ~ finally end
		return result;
	}
	public static int delete(int groupId) {
		int result=0;
		SqlSession session = null;
		try {
			session= SqlSessionUtil.getSession();
			result = session.delete("groups.delete",groupId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!= null) {
				session.close();
			}
		}//try ~ catch ~ finally end
		
		return result;
	}
}
