package array;

public class Ex5 {

	public static void main(String[] args) {
		String[] movies = {
				"테넷","엑스맨","반지의제왕","인터스텔라","겨울왕국2"
		};
		int size = movies.length;
		for(int i=0; i<size; i++) {
			System.out.println(movies[i]);
		}
		
		/*
		 * 
		 * 자바 5(1.5)에서 추가된 향상된 for문
		 * (for each 문)
		 * for(자료형 변수명 : 배열 혹은 컬렉션){
		 * 
		 * 
		 * 
		 * }
		 * 
		 */
		for(String movie:movies) {
			System.out.println(movie);
		}
		
	}
}
