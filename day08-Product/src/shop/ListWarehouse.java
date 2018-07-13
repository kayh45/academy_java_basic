package shop;

import java.util.ArrayList;
import java.util.List;

/**
 * 제품 정보를 저장할 자료구조를 리스트로 관리하는 창고 클래스
 * 
 * @author PC38219
 *
 */

public class ListWarehouse implements GeneralWarehouse {

	private List<Product> products;
	
	public ListWarehouse() {
		products = new ArrayList<Product>();
	}
	
	public ListWarehouse(List<Product> products) {
		super();
		this.products = products;
	}

	@Override
	public int add(Product product) {
		boolean success = products.add(product);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public Product get(Product product) {
		int getIndex = findProductIdx(product);
		Product finded = null;
		
		if (getIndex > -1) {
			// 찾아올 제품이 존재
			finded = products.get(getIndex);
		}
		
		return finded;
	}

	@Override
	public int set(Product product) {
		int setIdx = findProductIdx(product);
		
		if (setIdx > -1) {
			products.set(setIdx, product);
		}
		
		return setIdx;
		
	}

	@Override
	public int remove(Product product) {
		int rmvIdx = findProductIdx(product);
		
		if (rmvIdx > -1) {
			products.remove(rmvIdx);
		}
		
		return rmvIdx;
		
	}

	@Override
	public List<Product> getAllProducts() {
		return products;
	}
	
	// 리스트 안에 찾으려는 제품의 인덱스를 구하는 지원 메소드
	private int findProductIdx(Product product) {
		int index = -1;
		
		for (int idx = 0; idx < products.size(); idx++) {
			if (products.get(idx).equals(product)) {
				index = idx;
				break;
			}
		}
		
		return index;
	}

}
