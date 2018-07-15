package shoes.set;

import shoes.Shoe;
/* ****************************************************************
 * by.hnc : 강사라면 이런식으로 테스트할 것입니다.
 * **************************************************************** */
/**
 * Shoe 클래스를 테스트 (List)
 * @author PC38219
 *
 */
public class ShoeSetTest {

	public static void main(String[] args) {

		ShoeSet shoes = new ShoeSet();
		
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
		// by.hnc : 코드값만 가진 비교 객체를 생성
		Shoe shHnc003 = new Shoe("SH003");
		//          코드 값만 가진 객체로 get() 수행
		System.out.println(shoes.get(shHnc003));
		
		// 5. SH003 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		// by.hnc : 다른 값은 모두 같고 재고가 0인 객체를 새로 생성
		Shoe shHncQ0 = new Shoe("SH003", "샤이나 3.5", 245, 39000, "워킹부츠", 0);
		// 재고가 0인 객체를 새로 세팅
		shoes.set(shHncQ0);
		
		
		
		
		System.out.println("======== 6 ========");
		// 6. 재고가 조정된 내용 출력
		// by.hnc : 조정내용 검색할때는 코드 값만 가진 객체로 다시 조회
		System.out.println(shoes.get(shHnc003));

		// 7. SH003 번 코드로 등록된 신발 정보를 삭제
//		shoes.remove(shoes.get(new Shoe("SH003")));
		// by.hnc : 굳이 get 을 한 후에 그 리턴받은 결과로 삭제할 필요 없습니다.
		//          remove() 로직을 보면 코드값만으로 비교하여 삭제 할 수 있으므로
		//          아래의 로직으로 정확한 삭제가 가능합니다.
		//          자신이 작성했던 코드의 의미를 다시한번 곰곰히 생각해보기 바랍니다.
		shoes.remove(new Shoe("SH003"));

		System.out.println("======== 8 ========");
		// 8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
		for (Shoe shoe : shoes.getAllShoes()) {
			System.out.println(shoe);
		}

	}

}
