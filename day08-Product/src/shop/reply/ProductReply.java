package shop.reply;

import shop.Product;

/**
 * 매니저가 1건의 제품정보를 가지고 왔을 떄
 * 출력할 응답을 구현
 * 
 * @author PC38219
 *
 */
public class ProductReply implements Reply {

	
	@Override
	public void reply(Object object) {
		// object로 들어오는 대상이 Product 타입인 것이 확실하다.
		
		Product product = (Product)object;
		product.print();

	}

}
