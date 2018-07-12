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
	public void add(Product product) {
		products.add(product);
		
	}

	@Override
	public Product get(Product product) {
		int getIndex = findProductIdx(product);
		
		return products.get(getIndex);
	}

	@Override
	public void set(Product product) {
		int setIdx = findProductIdx(product);
		
		if (setIdx > -1) {
			products.set(setIdx, product);
		}
		
	}

	@Override
	public void remove(Product product) {
		int rmvIdx = findProductIdx(product);
		
		if (rmvIdx > -1) {
			products.remove(rmvIdx);
		}
		
		
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
