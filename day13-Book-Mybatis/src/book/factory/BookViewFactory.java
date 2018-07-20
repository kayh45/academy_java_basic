package book.factory;

import book.view.BookView;
import book.view.ErrorView;
import book.view.ListView;
import book.view.MessageView;
import book.view.SingleView;

public class BookViewFactory {

public static BookView getBookView(String type) {
		
		BookView view = null;
		
		if ("list".equals(type)) {
			view = new ListView();
			
		} else if ("message".equals(type)) {
			view = new MessageView();
			
		} else if ("error".equals(type)) {
			view = new ErrorView();
			
		} else if ("single".equals(type)) {
			view = new SingleView();
			
		}
		
		return view;
		
	}
	
}
