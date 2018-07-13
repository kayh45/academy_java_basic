package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapWarehouse implements GeneralWarehouse {

	// 멤버변수 선언부
	private Map<String, Product> products;
	
	// 생성자 선언부	
	public MapWarehouse() {
		products = new HashMap<String, Product>();
	}
	
	public MapWarehouse(Map<String, Product> products) {
		super();
		this.products = products;
	}

	// 메소드 선언부
	@Override
	public int add(Product product) {
		int addResult = -1;
		
		if (!products.containsValue(product)) {
			products.put(product.getProdCode(), product);
			addResult = 1;
		}			
			
		return addResult;
	}

	@Override
	public Product get(Product product) {
		return products.get(product.getProdCode());
	}

	@Override
	public int set(Product product) {
		int setResult = -1;
		
		if (products.containsValue(product)) {			
			products.put(product.getProdCode(), product);
			setResult = 1;
		}
		
		return setResult;
	}

	@Override
	public int remove(Product product) {
		int rmResult = -1;
		Product removed = products.remove(product.getProdCode());
		
		if (removed != null) {
			rmResult = 1;
		}
		return rmResult;
	}

	@Override
	public List<Product> getAllProducts() {
		Set<String> ketSet = products.keySet();
		List<Product> prodList = new ArrayList<Product>();
		
		for (String key : ketSet) {
			prodList.add(products.get(key));
		}
		
		return prodList;
	}

}
