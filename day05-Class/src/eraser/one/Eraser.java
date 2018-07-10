package eraser.one;
/**
 * 칠판 지우개를 정의하는 클래스 
 * ------------------------------------
 * 칠판 지우개의 속성을 정의하기 위하여
 * 가로 : width  : double
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹   : layer  : int
 * 네 개의 멤버 변수를 선언
 * ------------------------------------
 * 기본 생성자 : 매개 변수를 받지 않는 생성자
 * 매개 변수를 받는 생성자
 * 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서
 * 매개변수를 받도록 정의한다.
 * ------------------------------------
 * 칠판 지우개의 상태를 출력 : print() : void
 * 지우개의 한 겹을 제거 : peel() : void
 * ------------------------------------
 * 
 * @author PC38219
 *
 */
public class Eraser {
	// 1. 멤버 변수 선언부
	/** 칠판 지우개의 가로 길이*/
	double width;
	/** 칠판 지우개의 세로 길이*/
	double height;
	/** 칠판 지우개의 높이*/
	double depth; 
	/** 칠판 지우개 겹 수*/
	int layer;

	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	Eraser() {
		
	}
	
	/**
	 * 매개 변수 값을 받는 생성자 
	 * 
	 * @param width
	 * @param height
	 * @param depth
	 * @param layer
	 */
	Eraser(double width, double height, double depth, int layer) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
	}
	
	
	// 3. 메소드 선언부
	/**
	 * 칠판 지우개의 상태를 출력하는 메소드
	 */
	public void print() {
		System.out.printf("===== 칠판 지우개의 상태 =====%n");
		System.out.printf("가로 : %2.1f, 세로 : %2.1f, 높이 : %2.1f, 겹 : %d%n", width, height, depth, layer);
	}
	
	/**
	 * 지우개의 한 겹을 제거하는 메소드
	 */
	public void peel() {
		// 남아있는 겹의 수가 -값이 될 수는 없으므로
		// if 구문을 사용하여 값을 체크
		if (layer >= 1) {
			layer -= 1;
		} else {
			System.out.println("더이상 제거할 수 없습니다.");
		}
	}
	
}
