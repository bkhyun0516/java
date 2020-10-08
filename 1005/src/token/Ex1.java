package token;

import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 문자열을 쪼갤 때
		 * 예) "가,나,다,라"를
		 * "가"
		 * "나"
		 * "다"
		 * "라"
		 * 
		 * 방법
		 * 1) String이 가진 split메서드
		 * 2) StringTokenizer 클래스 이용
		 * 
		 * 
		 */
//		StringTokenizer stok = new StringTokenizer("가|나|다|라");
		String movies =
				"담보,뮬란,오케이마담,강철비2,겨울왕국2";
		String[] movieArr = movies.split(",");
		for (int i = 0; i < movieArr.length; i++) {
			System.out.println(movieArr[i]);
		}
		String movies2 =
				"담보|뮬란|오케이마담|강철비2|겨울왕국2";
		String[] movieArr2 = movies2.split("\\|");
		
		for (String movie : movieArr2) {
			System.out.println(movie);
		}

	}//main() end

}
