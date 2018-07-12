package school;

/**
 * 학교 구성원 중 학생, 교사만
 * 구현할 수업을 나타내는 인터페이스
 * 
 * @author PC38219
 *
 */
public interface Lesson {

	/**
	 * 수업을 진행함
	 * 
	 * @return
	 */
	// public abstract 선언은 당연하므로
	// 생략하도 자동으로 지원함
	String lesson();
}