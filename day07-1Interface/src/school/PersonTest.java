package school;

/**
 * Person 과 상속관계인 Student 를 
 * 테스트 하는 클래스이다.
 * @author PC38219
 *
 */
public class PersonTest {

	public static void main(String[] args) {

		// 1. 선언 2. 초기화
		Person[] persons = new Person[3];
		
		persons[0] = new Student("S02", "홍길동", 18, "도술");
		persons[1] = new Teacher("T03", "강현", 25, "프로그래밍");
		persons[2] = new Employee("E04", "김철수", 22, "경영지원팀");
		
		// 3. 사용
		for (Person person : persons) {
			person.print();
		}
		
	}

}
