package cart.imp;

import cart.Cart;
import cart.Item;
import cart.PriceRule;

public class ShoppingRule implements PriceRule {	
	
	
	public double computePrice(Cart cart) {
		
		double totalPrice = 0;
		
		
		Integer oneGigaCount = (Integer) cart.getItemCount().get(Item.ONE_GIGA);
		
		totalPrice += oneGigaCount * cart.getItemPrice(Item.ONE_GIGA);
		
		
		Integer smallUnlGigaCount =  (Integer) cart.getItemCount().get(Item.ULT_SMALL);
		
		
				
		if((smallUnlGigaCount / 3) > 0) {
			totalPrice += (smallUnlGigaCount / 3) * cart.getItemPrice(Item.ULT_SMALL) * 2;
		}
		
		if((smallUnlGigaCount % 3) > 0) {
			
			totalPrice += (smallUnlGigaCount % 3) * cart.getItemPrice(Item.ULT_SMALL);
		}
		
		
		Integer mediumUnlGigaCount = (Integer) cart.getItemCount().get(Item.ULT_MEDIUM);
		
		
		totalPrice += mediumUnlGigaCount * cart.getItemPrice(Item.ULT_MEDIUM);
		
		
		Integer largeUnlGigaCount = (Integer) cart.getItemCount().get(Item.ULT_LARGE);
		
		
		
		if(largeUnlGigaCount > 3) {
			
			totalPrice += largeUnlGigaCount * cart.getItemPromoPrice(Item.ULT_LARGE);
			
		} else {
			
			totalPrice += largeUnlGigaCount * cart.getItemPrice(Item.ULT_LARGE);
		}
		
		
		if(cart.isDiscountPromo()) {
			totalPrice = totalPrice * (1-cart.getDiscount());
		}
		
		
				
		return totalPrice;
		
	}

	

}
