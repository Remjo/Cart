package cart;

import java.util.List;
import java.util.Map;

public interface Cart {
	
	public void add(Item item);
	
	public void add(Item item, String promoCode);
	
	public Map<String, Integer> getItemCount();
	
	public List<Item> getItems();
	
	public boolean isDiscountPromo();
	
	public double getDiscount();
	
	public double getItemPrice(String itemType);
	
	public double getItemPromoPrice(String itemType);
	
	public void displayTotalPrice();
	
	public void displayCheckOutItems();

}
