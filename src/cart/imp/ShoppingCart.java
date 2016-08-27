package cart.imp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import cart.Cart;
import cart.Item;
import cart.PriceRule;
import cart.PromoCode;

public class ShoppingCart implements Cart {
	
	
	private HashMap<String, Integer> itemCount;
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private boolean discountPromo;
	private double discount;
	PriceRule pricingRule;
	
	public ShoppingCart(PriceRule pricingRule) {
		this.pricingRule = pricingRule;
		initializeCart();
	}
	
	public void initializeCart() {
		itemCount = new HashMap<String, Integer>();
		
		itemCount.put(Item.ONE_GIGA, 0);
		itemCount.put(Item.ULT_SMALL, 0);
		itemCount.put(Item.ULT_MEDIUM, 0);
		itemCount.put(Item.ULT_LARGE, 0);
		
	}

	@Override
	public void add(Item item) {
		
		addItem(item);
	}
	
	

	@Override
	public void add(Item item, String promoCode) {
		
		if(PromoCode.TEN_PERCENT_DISCOUNT.equals(promoCode)) {
			discountPromo = true;
			
			Properties prop = new Properties();
			InputStream input = null;
		

			
			try {
				input = new FileInputStream("price.properties");
				prop.load(input);
				
				discount = Double.parseDouble(prop.getProperty(PromoCode.TEN_PERCENT_DISCOUNT));
			}catch (IOException e) {
				
				e.printStackTrace();
			}
			
			//discount = 0.10;
		}
		addItem(item);
	}
	
	private void addItem(Item item) {
		
		int noOfItem = itemCount.get(item.getType());
		itemCount.put(item.getType(), noOfItem +1);
		itemList.add(item);
		
	}

	@Override
	public Map<String, Integer> getItemCount() {		
		return itemCount;
	}

	@Override
	public List<Item> getItems() {
		return itemList;
	}

	@Override
	public boolean isDiscountPromo() {		
		return discountPromo;
	}

	@Override
	public double getItemPrice(String itemType) {
		
		for(int cnt = 0; cnt < itemList.size(); cnt++) {
			
			if( itemType.equals(itemList.get(cnt).getType()) ) {
				
				return itemList.get(cnt).getPrice();
			}
			
		}
		
		return 0;
	}

	@Override
	public double getItemPromoPrice(String itemType) {
		for(int cnt = 0; cnt < itemList.size(); cnt++) {
			
			if( itemType.equals(itemList.get(cnt).getType()) ) {
				
				return itemList.get(cnt).getPromoPrice();
			}
			
		}
		
		return 0;
	}

	
	public void displayTotalPrice() {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Total Price = " + df.format(pricingRule.computePrice(this)));
		
	}

	@Override
	public void displayCheckOutItems() {
		
		
		Integer smallUnlGigaCount =  (Integer) itemCount.get(Item.ULT_SMALL);
		
		if(smallUnlGigaCount > 0) {
			System.out.println( smallUnlGigaCount + " x Unlimited 1 GB");
		}
		
		Integer mediumUnlGigaCount =  (Integer) itemCount.get(Item.ULT_MEDIUM);
		
		if(mediumUnlGigaCount > 0) {
			System.out.println( mediumUnlGigaCount + " x Unlimited 2 GB");
		}
		
		
		Integer largeUnlGigaCount =  (Integer) itemCount.get(Item.ULT_LARGE);
		
		if(largeUnlGigaCount > 0) {
			System.out.println( largeUnlGigaCount + " x Unlimited 5 GB");
		}
		
		Integer oneGigaCount = (Integer) itemCount.get(Item.ONE_GIGA);
		
		if(oneGigaCount > 0 || mediumUnlGigaCount > 0 ) {
			System.out.println((oneGigaCount + mediumUnlGigaCount) + " x 1 GB Data-pack" );
		}
		
	}

	@Override
	public double getDiscount() {
		
		return this.discount;
	}

}
