package io.data;
/**
 * 
 * 기본 생성자, 필드 1개씩 늘려가며 총 5개 중복정의
 * 
 * print()    				   : 	void
 * discount(double percentage) : 	int
 * sell(int amount)			   : 	void   : 	quantity 감소 변경
 * buy(int amount)			   : 	void   :	quantity 증가 변경
 * 
 * @author PC38219
 *
 */
public class Product {
	/** 제품 코드 */
	private String prodCode;
	/** 제품 명 */
	private String prodName;
	/** 제품 가격 */
	private int price;
	/** 제품 수량 */
	private int quantity;
	
	/**
	 * 기본 생성자
	 */
	public Product() {
		
	}
	/**
	 * 매개변수를 prodCode 하나만 받는 생성자
	 * 
	 * @param prodCode
	 */
	public Product(String prodCode) {
		this.prodCode = prodCode;
	}
	/**
	 * 매개변수를 prodCode, prodName 두 개 받는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 */
	public Product(String prodCode, String prodName) {
		this(prodCode);
		this.prodName = prodName;
	}
	/**
	 * 매개변수를 prodCode, prodName, price 세 개를 받는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 * @param price
	 */
	public Product(String prodCode, String prodName, int price) {
		this(prodCode, prodName);
		this.price = price;
	}
	/**
	 * 모든 필드를 매개변수로 받는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}	
	
	/** prodCode 의 접근자 */
	public String getProdCode() {
		return this.prodCode;
	}

	/** prodCode 의 수정자 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/** prodName 의 접근자 */
	public String getProdName() {
		return prodName;
	}
	
	/** prodName 의 수정자 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	/** price 의 접근자 */
	public int getPrice() {
		return price;
	}
	
	/** price 의 수정자 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/** quantity 의 접근자 */
	public int getQuantity() {
		return quantity;
	}
	
	/** quantity 의 수정자 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		
		String strProduct = String.format("제품 정보 [제품코드 : %s, 제품명 : %s, 제품가격 : %,d원, 재고수량 : %d]%n", prodCode, prodName, price, quantity);
		return strProduct;
	}

	
}
