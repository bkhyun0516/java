package token;

import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {
		String s= "1,2,3,4,5";
		StringTokenizer stok = new StringTokenizer(s,",");
		while(stok.hasMoreTokens()) {
			int num = Integer.parseInt(stok.nextToken());
			System.out.println(num);
		}//
	}//main() end

}
