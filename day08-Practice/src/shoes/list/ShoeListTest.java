package shoes.list;

import shoes.Shoe;

/**
 * Shoe 클래스를 테스트 (List)
 * @author PC38219
 *
 */
public class ShoeListTest {

	public static void main(String[] args) {

		ShoeList shoes = new ShoeList();
		
		Shoe adidas = new Shoe("SH001", "슈퍼스타", 260, 87200, "스니커즈", 20);
		Shoe howkins = new Shoe("SH002", "플레인 로퍼", 275, 103500, "구두", 8);
		Shoe nuovo = new Shoe("SH003", "샤이나 3.5", 245, 39000, "워킹부츠", 15);
		Shoe newBal = new Shoe("SH004", "W480SP", 280, 79000, "운동화", 12);
		
		// 2. Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를 선언하여 리스트에 add(shoe) 로 추가
		shoes.add(adidas);
		shoes.add(howkins);
		shoes.add(nuovo);
		shoes.add(newBal);
		
		System.out.println("======== 3 ========");
		// 3. 각 자료구조별 shoes 를 foreach 로 출력
		for (Shoe shoe : shoes.getAllShoes()) {
			System.out.println(shoe);
		}
		
		System.out.println("======== 4 ========");
		
		// 4. SH003 번 코드로 등록된 신발의 정보 1개를 출력	
		
		System.out.println(shoes.get(new Shoe("SH003")));

		// 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		Shoe sh003 = shoes.get(new Shoe("SH003"));
		
//		sh003.setQuantity(0);
		shoes.set(sh003);		
		
		System.out.println("======== 6 ========");
		// 6. 재고가 조정된 내용 출력
		System.out.println(shoes.get(new Shoe("SH003")));

		// 7. SH003 번 코드로 등록된 신발 정보를 삭제
		shoes.remove(shoes.get(new Shoe("SH003")));

		System.out.println("======== 8 ========");
		// 8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
		for (Shoe shoe : shoes.getAllShoes()) {
			System.out.println(shoe);
		}

	}

}
