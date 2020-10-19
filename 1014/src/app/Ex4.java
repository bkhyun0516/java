package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Book;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 책번호?");
		int no = Integer.parseInt(scan.nextLine());
		//scan.nextInt()로 받으면 엔터를 못받기
		//때문에 엔터가 밑에 타이틀로 넘어간다.
		// 따라서 nextLine()으로 받고 int 형으로 변환
		System.out.println("수정할 이름?");
		String title = scan.nextLine();
		System.out.println(no+" : "+title);
		
		Book book = new Book(no, title);
		SqlSession session = SqlSessionUtil.getSession();
		int result = session.update("books.update",book);
		System.out.println(result + "개 수정");
		
	}

}
