package book.view;

import java.util.List;

import book.vo.Book;

public class ListView implements BookView {

	@Override
	public void display(Object object) {
		// object로 도서 정보 목록이 넘어온다.
		List<Book> books = (List<Book>)object;
		for (Book book : books) {
			System.out.println(book);
		}

	}

}
