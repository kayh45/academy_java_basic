package shop;

import java.util.List;

public interface GeneralWarehouse {
	public int add(Product product);
	public Product get(Product product);
	public int set(Product product);
	public int remove(Product product);
	public List<Product> getAllProducts();

}
