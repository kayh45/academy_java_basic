package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import shoes.Shoe;

public class ShoeMap {

	// 멤버 변수 선언부
	private Map<String, Shoe> shoes;
	
	// 생성자 선언부
	public ShoeMap() {
		shoes = new HashMap<String, Shoe>();
	}
	
	public ShoeMap(Map<String, Shoe> shoes) {
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
		boolean isContain = shoes.containsKey(shoe.getShoeCode());
		int addResult = 0;
		
		if (!isContain) {
			shoes.put(shoe.getShoeCode(), shoe);
			addResult = 1;
		}
		
		return addResult;
	}
	
	/**
	 * set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int set(Shoe shoe) {
		boolean isContain = shoes.containsKey(shoe.getShoeCode());
		int setResult = 0;
		
		if (isContain) {
			shoes.put(shoe.getShoeCode(), shoe);
			setResult = 1;
		}
		
		return setResult;
	}
	
	/**
	 * remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
	 * @param shoe
	 * @return
	 */
	public int remove(Shoe shoe) {
		// Map.remove(Object Key) : 
		// 매개변수로 받는 키가 Map에 없으면 null을 리턴하고
		//                 키가 Map에 있으면 키와 매핑되는 Value를 리턴하고 삭제
		Shoe removeResult = shoes.remove(shoe.getShoeCode());
		
		// 삭제 결과가 null이면 (삭제가 실패하면) 0 리턴
		// null이 아니면 (삭제가 성공하면) 1 리턴
		return (removeResult == null) ? 0 : 1;
		
	}
	
	/**
	 * get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
	 * @param shoe
	 * @return
	 */
	public Shoe get(Shoe shoe) {
		return shoes.get(shoe.getShoeCode());
	}
	
	/**
	 * getAllShoes()  : List<Shoe> : 전체목록을 리턴
	 * @return
	 */
	public List<Shoe> getAllShoes() {
		List<Shoe> allShoes = new ArrayList<Shoe>();
		Set<String> keySet = new HashSet<String>();
		
		keySet = shoes.keySet();
		for (String key : keySet) {
			allShoes.add(shoes.get(key));
		}
		
		return allShoes;
	}
	
	
}
