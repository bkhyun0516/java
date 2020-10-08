package token;

import java.util.StringTokenizer;

public class Ex2 {
	public static void main(String[] args) {
		/*
		 * StringTokenizer가 가진 주요 메서드
		 * - hasMoreTokens() : 남아잇는 토큰의 유무
		 *					(true, false)
		 * - nextToken() : 현재 토크을 반환하면서 커서가 이동
		 * 
		 * 
		 */
		StringTokenizer stok =
				new StringTokenizer("담보,뮬란,오케이마담,강철비2,겨울왕국2",",");
		StringTokenizer stok2 =
				new StringTokenizer("담보|뮬란|오케이마담|강철비2|겨울왕국2","|");
	
		while(stok.hasMoreTokens()) {
			String movie = stok.nextToken();
			System.out.println(movie);
		}//while end();
	}//main() end
}
