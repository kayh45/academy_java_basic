package book.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import book.dao.BookShelf;
import book.dao.JdbcBookShelf;
import book.dao.ListBookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListJUnitTest2 {

	private Book b001;
	
	BookShelf shelf;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
		b001 = new Book("B001", "역사의 역사", "유시민", 16000, "9788971998557", "돌베개");
		shelf = new ListBookShelf();
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void test0DeleteAll() {
		shelf.delete();
	}

	@Test
	public void test1Insert() throws DuplicateException, NotFoundException {
		
		shelf.insert(b001);
		
		Book send = new Book("B001");
		Book searched = shelf.select(send);
		
		assertThat("실패 : 동일한 객체가 아님(bookID)", searched.getBookId(), is(b001.getBookId()));
		assertThat("실패 : 동일한 객체가 아님(title)", searched.getTitle(), is(b001.getTitle()));
		assertThat("실패 : 동일한 객체가 아님(price)", searched.getPrice(), is(b001.getPrice()));
		assertThat("실패 : 동일한 객체가 아님(author)", searched.getAuthor(), is(b001.getAuthor()));
		assertThat("실패 : 동일한 객체가 아님(isbn)", searched.getIsbn(), is(b001.getIsbn()));
		
	}
	
	@Test
	public void test2Update() throws DuplicateException, NotFoundException {
		
		Book updated = new Book("B001", "역사의 역사", "유시민", 10000, "9788971998557", "돌베개");
		
		shelf.update(updated);
		
		Book send = new Book("B001");
		Book searched = shelf.select(send);
		
		assertThat("실패 : 동일한 객체가 아님", searched.getBookId(), is(b001.getBookId()));
		
	}
	
	@Test
	public void test3AllBook() {
		
		int size = shelf.totalCount();
		
		assertThat("실패 : 데이터 건수가 맞지 않음", size, is(1));
	}

}
