package product;
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
	String prodCode;
	/** 제품 명 */
	String prodName;
	/** 제품 가격 */
	int price;
	/** 제품 수량 */
	int quantity;
	
	/**
	 * 기본 생성자
	 */
	Product() {
		
	}
	/**
	 * 매개변수를 prodCode 하나만 받는 생성자
	 * 
	 * @param prodCode
	 */
	Product(String prodCode) {
		this.prodCode = prodCode;
	}
	/**
	 * 매개변수를 prodCode, prodName 두 개 받는 생성자
	 * 
	 * @param prodCode
	 * @param prodName
	 */
	Product(String prodCode, String prodName) {
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
	Product(String prodCode, String prodName, int price) {
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
	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode, prodName, price);
		this.quantity = quantity;
	}

	/**
	 * 제품의 상태를 출력하는 메소드
	 */
	public void print() {
		System.out.printf("제품 정보 [제품코드 : %s, 제품명 : %s, 제품가격 : %d, 재고수량 : %d]%n", prodCode, prodName, price, quantity);
	}
	/**
	 * 입력된 퍼센트 만큼 할인가격 리턴하는 메소드
	 * 
	 * @param percentage	:	할인율	: double
	 * @return	: 할인된 가격을 리턴 	: int
	 */
	public int discount(double percentage) {
		
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}		
		
		return price;		
		
		// return (int)(price * (1 - percentage));
	}
	/**
	 * 매장에서 판매(출고)되어 재고 수량이 줄어드는 메소드
	 * 
	 * @param amount	:	판매량
	 */
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만 출고함.
		if (quantity >= amount) {
			quantity -= amount;
			System.out.printf("%s(%s) 제품을 %d개 판매하였습니다. (%d 원)", prodName, prodCode, amount, (price * amount));
			System.out.printf(" (재고 수량 : %d)%n", quantity);
		} else {
			System.out.printf("그렇게 많이는 판매할 수 없습니다. (재고 수량 : %d)%n", amount);
		}
	}
	/**
	 * 매장에 입고되어 재고수량이 늘어나는 메소드
	 * 
	 * @param amount	:	입고량
	 */
	public void buy(int amount) {
		quantity += amount;
		System.out.printf("%s(%s) 제품을 %d개 구입하였습니다. (- %d 원)", prodName, prodCode, amount, (price * amount));
		System.out.printf(" (재고 수량 : %d)%n", quantity);
	}
	
	
}
