package com.bmj.exam.app;

import java.util.List;
import java.util.Scanner;

import com.bmj.exam.dao.MoviesDAO;
import com.bmj.exam.vo.Movie;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Movie> movies=MoviesDAO.selectNameList(); 
		int size = movies.size();
		for (int i = 0; i < size; i++) {
			System.out.print(movies.get(i).getNo()+ ") "+ movies.get(i).getName()+"  ");
			if(i%4==3) {
				System.out.println();
			}//if end
		}// for end
		if(size%4!=0) {
			System.out.println();
		}//if end
		System.out.println("삭제할 영화번호는?");
		int no = Integer.parseInt(scan.nextLine());
		int result = MoviesDAO.delete(no);
		if(scan!= null) {
			scan.close();
		}//if end
		if(result!=0) {
			System.out.println(result+"개의 영화가 삭제되었습니다.");
		}else {
			System.out.println("삭제되지 않았습니다.");
		}//if~else end
		
	}// main() end

}
