package book.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import book.dao.BookShelf;
import book.dao.JdbcBookShelf;
import book.dao.ListBookShelf;
import book.dao.MapBookShelf;
import book.dao.SetBookShelf;
import book.vo.Book;


public class BookShelfFactory {
	
	public static BookShelf getBookShelf(String type) {
		
		BookShelf bookShelf = null;
		
		if ("list".equals(type)) {
			List<Book> products = new ArrayList<Book>();
			bookShelf = new ListBookShelf(products);
			
		} else if ("set".equals(type)) {
			Set<Book> products = new HashSet<Book>();
			bookShelf = new SetBookShelf(products);
			
		} else if ("map".equals(type)) {
			Map<String, Book> products = new HashMap<String, Book>();
			bookShelf = new MapBookShelf(products);
			
		} else if ("jdbc".equals(type)) {
			bookShelf = JdbcBookShelf.getInstance();
			
		}
		
		return bookShelf;
	}
}
