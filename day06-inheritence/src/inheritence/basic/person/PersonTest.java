package inheritence.basic.person;

/**
 * Person 과 상속관계인 Student 를 
 * 테스트 하는 클래스이다.
 * @author PC38219
 *
 */
public class PersonTest {

	public static void main(String[] args) {

		// 1. 선언 2. 초기화
		Person person = new Person("P01", "홍길동", 18);
		Student student = new Student("S02", "홍길동", 18, "도술");
		Teacher teacher = new Teacher("T03", "강현", 25, "프로그래밍");
		Employee employee = new Employee("E04", "김철수", 22, "경영지원팀");
		
		// 3. 사용
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employee);
		
	}

}
