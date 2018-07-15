package shoes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shoes.Shoe;

public class ShoeSet {
	// 멤버변수 선언부
	private Set<Shoe> shoes;
	
	// 생성자 선언부
	public ShoeSet() {
		shoes  = new HashSet<Shoe>();
	}

	public ShoeSet(Set<Shoe> shoes) {
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
		int setInt = 0;
		
		if (isContain(shoe)) {
			shoes.add(shoe);
			setInt = 1;
		}	
		
		return setInt;
		
	}
	
	/**
	 * remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int remove(Shoe shoe) {
		int rmvInt = 0;
		
		if (isContain(shoe)) {
			shoes.remove(shoe);
			rmvInt = 1;
		} 
		
		return rmvInt;
	}
	
	/**
	 * get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
	 * @param shoe
	 * @return
	 */
	public Shoe get(Shoe shoe) {
		Shoe gotShoe = null;
		
		for (Shoe loopShoe : shoes) {
			if (loopShoe.equals(shoe)) {
				gotShoe = loopShoe;
				break;
			}
		}
		
		return gotShoe;
	}
	
	/**
	 * getAllShoes()  : List<Shoe> : 전체목록을 리턴
	 * @return
	 */
	public List<Shoe> getAllShoes() {
		List<Shoe> shoeList = new ArrayList<Shoe>();
		
		for (Shoe loopShoe : shoes) {
			shoeList.add(loopShoe);
		}
		
		return shoeList;
	}
	
	private boolean isContain(Shoe shoe) {
		return shoes.contains(shoe);
	}
	
	
}
