package app;

import java.sql.Date;
import org.apache.ibatis.session.SqlSession;
import util.SqlSessionUtil;
import vo.Book;

public class Ex2 {

	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		Book book = new Book();
		book.setAuthor("유발 하라리");
		book.setTitle("사피엔스");
		book.setPageNum(636);
		Date publicationDate = Date.valueOf("2015-11-24");// new Date로 직접 만들지 않는다.
		book.setPublicationDate(publicationDate);
		int result = session.insert("books.insert",book);
		System.out.println(result + "개 입력");
	}

}
