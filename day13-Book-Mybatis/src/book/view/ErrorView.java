package book.view;

public class ErrorView implements BookView {

	@Override
	public void display(Object object) {
		String errorMsg = (String)object;
		System.err.println(errorMsg);

	}

}
