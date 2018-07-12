package api.map.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import api.object.Product;

public class GenericMapTest {

	public static void main(String[] args) {
		Product adidas = new Product("S001", "슈퍼스타", 87200, 5);
		Product reebok = new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		Product nike = new Product("S003", "나이키 탄준 샌들", 41300, 30);
		Product crocs = new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		Product birkenstock = new Product("S005", "지제 에바", 29000, 15);
		
		// 1. 선언 : key : String, value : Product로 
		//           Generic 을 적용한 Map으로 선언
		Map<String, Product> products;
	
		// 2. 초기화 : key : String, value : Product로 
		//             Generic 을 적용한 HashMap으로 초기화
		products = new HashMap<String, Product>();
	
		// 3. 사용
		products.put(adidas.getProdCode(), adidas);
		products.put(nike.getProdCode(), nike);
		products.put(reebok.getProdCode(), reebok);
		products.put(crocs.getProdCode(), crocs);
		products.put(birkenstock.getProdCode(), birkenstock);
		
		// foreach 로 전체 출력
		Set<String> keys = products.keySet();
		for (String key : keys) {
			Product prod = products.get(key);
			prod.buy(30);
			prod.print();
		}
	}

}
