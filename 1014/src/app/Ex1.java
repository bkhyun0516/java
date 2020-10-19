package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex1 {

	public static void main(String[] args) {
		
		SqlSession session = SqlSessionUtil.getSession();
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 책번호는?");
		int no= scan.nextInt();
		scan.close();
		int result = session.delete("books.delete", no);
		System.out.println(result + "개 삭제");
	}//main() end
	
}//Ex1 end
