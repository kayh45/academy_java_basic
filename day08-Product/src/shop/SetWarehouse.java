package shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetWarehouse implements GeneralWarehouse {

	// 멤버 변수 선언부
	private Set<Product> products;
	
	// 생성자 선언부
	public SetWarehouse() {
		products = new HashSet<Product>();
	}
	
	public SetWarehouse(Set<Product> products) {
		super();
		this.products = products;
	}
	 
	// 메소드 선언부
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
		Product found = null;

		for (Product prod : products) {
			// Product 클래스에서 equals를 재정의 했기때문에
			// prodCode만 같으면 같은 객체로 인식
			if (prod.equals(product)) {
				found = prod; 
				break;
			}
		}
		
		return found;
	}

	@Override
	public int set(Product product) {
		int setResult = -1;
		
		if (isContain(product)) {
			products.remove(product);
			products.add(product);
			setResult = 1;
		} 
		
		return setResult;
	}

	@Override
	public int remove(Product product) {
		int rmResult = -1;
		
		if (isContain(product)) {
			products.remove(product);
			rmResult = 1;
		} 
		
		return rmResult;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> prodList = new ArrayList<Product>();
		
		for (Product product : products) {
			prodList.add(product);
		}
		
		return prodList;
	}
	
	/**
	 * 제품 Set에 수정하거나 삭제할 제품이 있으면
	 * true를 리턴하는 메소드
	 * 
	 * @param product
	 * @return
	 */
	private boolean isContain(Product product) {
		return products.contains(product);
	}
	

}
