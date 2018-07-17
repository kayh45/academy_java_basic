package shop.test;

import static shop.factory.WarehouseFactory.getWarehouse;

import shop.controller.Manager;
import shop.dao.GeneralWarehouse;
import shop.vo.Product;;
/**
 * 매장에서 판매될 물건을 신규 추가/수정/삭제 등
 * 기능을 테스트하는 클래스
 * 
 * @author PC38219
 *
 */
public class ShopTest {

	public static void main(String[] args) {

		// 2. 선반을 설치할 창고를 지어야 함		
//		GeneralWarehouse warehouse = getWarehouse("array");
//		GeneralWarehouse warehouse = getWarehouse("list");
//		GeneralWarehouse warehouse = getWarehouse("set");
//		GeneralWarehouse warehouse = getWarehouse("map");
		GeneralWarehouse warehouse = getWarehouse("jdbc");
		
		// 3. 매장을 관리할 매니저를 고용함
		Manager manager = new Manager(warehouse);
		
		// 4. 매장을 오픈
//		Shop abcMart = new Shop(manager);
 		
		
		//-----------------------------------------------
		// 매장에 입고할 신규 제품(신발) 이 매장에 도착했다.
		
		Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
		Product reebok = new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		Product nike = new Product("S003", "나이키 탄준 샌들", 41300, 30);
		Product crocs = new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		Product birkenstock = new Product("S005", "지제 에바", 29000, 15);
		
		
		// 0. 모든 제품 삭제하고 시작
		manager.remove(adidas);
		manager.remove(reebok);
		manager.remove(nike);
		manager.remove(crocs);
		manager.remove(birkenstock);

		System.out.println("---------------------------------------");

		// 1. 매장에 도착한 제품을 입고
		manager.add(adidas);
		manager.add(reebok);
		manager.add(nike);
		manager.add(crocs);
		manager.add(birkenstock);
		
		
		
		// 2. 입고된 제품 전체 확인
		manager.getAllProducts();
		
		System.out.println("---------------------------------------");
		
		// 3. 아디다스 제품 수정
		Product adidas2 = new Product("S001", "슈퍼스타", 75000, 5);
		manager.set(adidas2);
	
		// 4. 수정된 아디다스 제품 수정 확인
		System.out.println();
		manager.get(new Product("S001", null, 0, 0));
		
		System.out.println("---------------------------------------");

		// 5. 판매 종료할 제품 폐기
		System.out.println();
		manager.remove(new Product("S001", null, 0, 0));
		
		// 6. 폐기 확인을 위해 전체 목록 재 조회
		System.out.println("---------------------------------------");
		manager.getAllProducts();
		
		// 7. 없는 코드 조회 ==> 
		Product p007 = new Product("P007");
		
		manager.get(p007);
		
		// 8. 없는 정보 수정
		manager.set(p007);
		
		// 9. 있는 제품 중복 추가 ==> 
		Product s001 = new Product("S002");
		manager.add(s001);
	}

}
