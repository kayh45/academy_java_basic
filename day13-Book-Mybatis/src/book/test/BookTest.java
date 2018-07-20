package book.test;

import static book.factory.BookShelfFactory.getBookShelf;

import java.util.List;

import book.controller.BookManager;
import book.dao.BookShelf;
import book.vo.Book;

public class BookTest {

	public static void main(String[] args) {

//		BookShelf bookShelf = getBookShelf("list");
//		BookShelf bookShelf = getBookShelf("set");
//		BookShelf bookShelf = getBookShelf("map");
//		BookShelf bookShelf = getBookShelf("jdbc");
		BookShelf bookShelf = getBookShelf("mybatis");
		
		BookManager manager = new BookManager(bookShelf);
		
		Book b001 = new Book("B001", "역사의 역사", "유시민", 20000, "9788971998557", "돌베개");
		Book b002 = new Book("B002", "데이터 자본주의", "빅토어 쇤베르거", 18000, "9788950975197", "21세기북스");
		Book b003 = new Book("B003", "사피엔스", "유발 하라리", 19800, "9788934972464", "김영사");
		Book b004 = new Book("B004", "강원국의 글쓰기", "강원국", 14400, "9791157061266", "매치미디어");
		Book b005 = new Book("B005", "바람의 열 두 방향", "어슐러 르귄", 12600, "9788952771841", "시공사");
		
		manager.insert(b001);
		manager.insert(b002);
		manager.insert(b003);
		manager.insert(b004);
		manager.insert(b005);
		
		System.out.println("==============================");
		manager.select();
		System.out.println("==============================");
		
		

		System.out.println("==============================");
		manager.select();
		System.out.println("==============================");
		
		manager.select(b002);
		System.out.println("============ B002 도서 정보 조회 ==========");
		
		// 가격으로 조회
		manager.select(20000, 17000);
		System.out.println("=========== 가격으로 도서 정보 조회 ============");
		
		// 키워드로 조회
		manager.select("데이터");
		System.out.println("=========== 키워드로 도서 정보 조회 ===========");
		
		// 모든 데이터 수 조회
		manager.totalCount();
		System.out.println("===========모든 도서 개수 조회 ===========");

//		Book delB001 = new Book("B001");
		Book delB001 = new Book("B001", null, null, 0, null, null);
		manager.delete(delB001);
		
//		Book udtB003 = new Book("B003", "사피엔스", "유발 하라리", 15000, "9788934972464", "김영사");
		Book udtB003 = new Book("B003", null, null, 15000, null, null);
		manager.update(udtB003);

		// 실행 후 모든 데이터 삭제
		manager.delete(null);
		
	}

}
