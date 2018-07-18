package book.controller;

import static book.factory.ViewFactory.getView;

import book.dao.BookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.view.BookView;
import book.vo.Book;

public class BookManager {

	// 멤버 변수 선언부
	private BookShelf bookShelf;
	private BookView bookView;
	
	// 생성자 선언부
	public BookManager() {}
	
	public BookManager(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	// 메소드 선언부
	
	// 접근 / 수정자 선언부
	public BookShelf getBookShelf() {
		return bookShelf;
	}

	public void setBookShelf(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	public BookView getBookView() {
		return bookView;
	}

	public void setBookView(BookView bookView) {
		this.bookView = bookView;
	}
	
	public void insert(Book book) {
		String message = null;
		
		try {
			bookShelf.insert(book);
			
			// 추가 성공한 경우
			message = String.format("도서 정보 [%s] 추가에 성공하였습니다.", book.getBookId());
			bookView = getView("message");
			
		} catch (DuplicateException e) {
			message = String.format("도서 정보 [%s] 추가에 실패하였습니다.", book.getBookId());
			bookView = getView("error");
			e.printStackTrace();
		
		} finally {
			// 제품 추가 시 예외가 발생해도, 안해도
			// 제품 추가에 대한 메시지가 출력되어야 하므로
			// finally 블록에 작성
			bookView.display(message);
			
		}
	}
	
	public void update(Book book) {
		String message = null;
		
		try {
			bookShelf.update(book);
			
			// 추가 성공한 경우
			message = String.format("도서 정보 [%s] 수정에 성공하였습니다.", book.getBookId());
			bookView = getView("message");
			
		} catch (NotFoundException e) {
			message = String.format("도서 정보 [%s] 수정에 실패하였습니다.", book.getBookId());
			bookView = getView("error");
			e.printStackTrace();
			
		} finally {
			// 제품 추가 시 예외가 발생해도, 안해도
			// 제품 추가에 대한 메시지가 출력되어야 하므로
			// finally 블록에 작성
			bookView.display(message);
			
		}
	}
	
	
}
