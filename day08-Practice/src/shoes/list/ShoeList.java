package shoes.list;

import java.util.ArrayList;
import java.util.List;

import shoes.Shoe;

public class ShoeList {

	// 멤버변수 선언부
	private List<Shoe> shoes;
	
	// 생성자 선언부
	public ShoeList() {
		shoes  = new ArrayList<Shoe>();
	}

	public ShoeList(List<Shoe> shoes) {
		super();
		this.shoes = shoes;
	}
	
	// 메소드 선언부
	/**
	 * add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int add(Shoe shoe) {
		int addInt = 0;
		boolean addResult = shoes.add(shoe);
		
		if (addResult) {
			addInt = 1;
		}
		
		return addInt;
		
	}
	
	/**
	 * set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int set(Shoe shoe) {
		int setIdx = findShoeIdx(shoe);
		
		if (setIdx > -1) {
			shoes.set(setIdx, shoe);
			setIdx = 1;
		} else {
			setIdx = 0;
		}
		
		return setIdx;
		
	}
	
	/**
	 * remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int remove(Shoe shoe) {
		int rmvIdx = findShoeIdx(shoe);
		
		if (rmvIdx > -1) {
			shoes.remove(rmvIdx);
			rmvIdx = 1;
		} else {
			rmvIdx = 0;
		}
		
		return rmvIdx;
	}
	
	/**
	 * get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
	 * @param shoe
	 * @return
	 */
	public Shoe get(Shoe shoe) {
		int getIdx = findShoeIdx(shoe);
		
		return shoes.get(getIdx);
	}
	
	/**
	 * getAllShoes()  : List<Shoe> : 전체목록을 리턴
	 * @return
	 */
	public List<Shoe> getAllShoes() {
		return shoes;
	}
	
	/**
	 * 매개변수로 Shoe 타입의 객체를 입력받아
	 * shoes (List<Shoe>)에서 해당 객체가 있는지 없는지
	 * 있다면 어떤 인덱스를 가지고 있는지를 리턴
	 * 
	 * @param shoe - 리스트에서 찾으려 하는 Shoe 타입의 객체
	 * 
	 * @return 객체가 리스트 안에 없으면 -1을 리턴하고
	 * 		   객체가 있으면 그 인덱스를 리턴한다.
	 * 
	 */
	private int findShoeIdx(Shoe shoe) {
		int index = -1;
		
		for(int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				index = idx;
				break;
			}
		}
		
		return index;
	}

	
}
