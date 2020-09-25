package test;

import vo.Movie;

public class MovieApp {

	public static void main(String[] args) {
		 Movie m1= new Movie();
		 m1.setTitle("테넷");
		 m1.setDirector("크리스토퍼놀란");
		 m1.setAudienceNum(1566895);
		 
		 String title = m1.getTitle();
		 String director = m1.getDirector();
		 int audienceNum = m1.getAudienceNum();
		 
		 System.out.println();
	}

}
