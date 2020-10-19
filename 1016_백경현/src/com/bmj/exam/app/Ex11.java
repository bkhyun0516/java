package com.bmj.exam.app;

import java.util.List;

import com.bmj.exam.dao.GenresDAO;
import com.bmj.exam.vo.Genre;

public class Ex11 {

	public static void main(String[] args) {
		List<Genre> genres = GenresDAO.selectList();
		for (Genre genre : genres) {
			System.out.println(genre);
		}//for end
	}//main() end

}
