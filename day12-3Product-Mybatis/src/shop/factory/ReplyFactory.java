package shop.factory;

import shop.reply.ErrorReply;
import shop.reply.ListReply;
import shop.reply.MessageReply;
import shop.reply.ProductReply;
import shop.reply.Reply;

/**
 * 매니저가 특정 응답을 할 때,
 * 응답 객체를 Reply 타입으로 생성하는 클래스
 * 
 * @author PC38219
 *
 */
public class ReplyFactory {

	public static Reply getReply(String type) {
		
		Reply reply = null;
		
		if ("list".equals(type)) {
			reply = new ListReply();
			
		} else if ("message".equals(type)) {
			reply = new MessageReply();
			
		} else if ("error".equals(type)) {
			reply = new ErrorReply();
			
		} else if ("single".equals(type)) {
			reply = new ProductReply();
			
		}
		
		return reply;
		
	}
	
}
