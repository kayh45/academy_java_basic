package inheritence.abstrct.person;

public class Teacher extends Person {
	// 1. 멤버 변수 선언부
	String subject;

	// 2. 생성자 선언부
	Teacher() {
		
	}
	
	Teacher(String subject) {
		this.subject = subject;
	}
	
	Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}
	
	// 3. 메소드 선언부
	/**
	 * 교사정보를 String 형태로 반환한다.
	 */
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목 : %s", subject);
		return "교사 정보 [" + super.toString() + teacherStr + "]";
	}
	
	@Override
	public void print() {
		System.out.println("=== 교사 ===");
		System.out.println(this);
	}
	
}
