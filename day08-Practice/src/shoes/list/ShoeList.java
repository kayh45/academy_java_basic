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
