package divider.scope;

public class DividerScopTest {

	public static void main(String[] args) {

		DividerScope divScope;
		
		divScope = new DividerScope();
		
		System.out.println("==== main 이 실행되었습니다. ====");
		
		divScope.level1();
		
		System.out.println("==== main 이 종료되었습니다. ====");
		
	}

}
