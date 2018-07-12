package shop;

import java.util.List;

public interface GeneralWarehouse {
	public void add(Product product);
	public Product get(Product product);
	public void set(Product product);
	public void remove(Product product);
	public List<Product> getAllProducts();

}
