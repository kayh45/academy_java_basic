package shoes;

/**
 * 신발의 정보를 저장하는 클래스
 * @author PC38219
 *
 */
public class Shoe {

	// 멤버 변수 선언부
	/** 신발 제품코드 */
	private String shoeCode;
	/** 신발 제품 명 */
	private String shoeName;
	/** 신발의 사이즈 (한국형 크기 240, 250 등) */
	private int size;
	/** 가격 */
	private int price;
	/** 신발의 타입 (운동화, 샌들 등) */
	private String type;
	/** 신발의 재고량 */
	private int quantity;
	
	public Shoe() {
		
	}
	
	// 생성자 선언부
	public Shoe(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	public Shoe(String shoeCode, String shoeName) {
		this.shoeCode = shoeCode;
		this.shoeName = shoeName;
	}

	public Shoe(String shoeCode, String shoeName, int size) {
		this.shoeCode = shoeCode;
		this.shoeName = shoeName;
		this.size = size;
	}


	public Shoe(String shoeCode, String shoeName, int size, int price) {
		this.shoeCode = shoeCode;
		this.shoeName = shoeName;
		this.size = size;
		this.price = price;
	}

	public Shoe(String shoeCode, String shoeName, int size, int price, String type) {
		super();
		this.shoeCode = shoeCode;
		this.shoeName = shoeName;
		this.size = size;
		this.price = price;
		this.type = type;
	}

	public Shoe(String shoeCode, String shoeName, int size, int price, String type, int quantity) {
		super();
		this.shoeCode = shoeCode;
		this.shoeName = shoeName;
		this.size = size;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
	}

	// 접근, 수정자 선언부
	public String getShoeCode() {
		return shoeCode;
	}

	public void setShoeCode(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	// 메소드 선언부
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoeCode == null) ? 0 : shoeCode.hashCode());
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
		Shoe other = (Shoe) obj;
		if (shoeCode == null) {
			if (other.shoeCode != null)
				return false;
		} else if (!shoeCode.equals(other.shoeCode))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		String strShoe = String.format("제품 정보 [제품코드 : %s, 제품명 : %s, 사이즈 : %dmm, "
				+ "제품가격 : %,d원, 타입 : %s, 재고수량 : %d개]%n", shoeCode, shoeName, size, price, type, quantity);
		
		return strShoe;
	}
	
	
	
	
	
}
