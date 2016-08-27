package cart.imp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cart.Item;

public class ShoppingItem implements Item {
	
	private double price;
	private double promoPrice;
	private String itemType;
	
	public ShoppingItem(String itemType) {
		this.itemType = itemType;
		setInitialPrice(itemType);
		
	}

	private void setInitialPrice(String itemType) {
		
		Properties prop = new Properties();
		InputStream input = null;
	

		
		try {
			input = new FileInputStream("price.properties");
			prop.load(input);
		
		
			switch (itemType) {
			
			case Item.ONE_GIGA:
				//price = 9.90;
				price = Double.parseDouble(prop.getProperty(Item.ONE_GIGA));
				break;
			case Item.ULT_SMALL:
				//price = 24.90;
				price = Double.parseDouble(prop.getProperty(Item.ULT_SMALL));
				break;
			case Item.ULT_MEDIUM:
				//price = 29.90;
				price = Double.parseDouble(prop.getProperty(Item.ULT_MEDIUM));
				break;
			case Item.ULT_LARGE:
				//price = 44.90;
				//promoPrice = 39.90;
				price = Double.parseDouble(prop.getProperty(Item.ULT_LARGE));
				promoPrice = Double.parseDouble(prop.getProperty(Item.ULT_LARGE_PROMO));
				break;
			default:
				price = 0;
				break;
			
			}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public double getPrice() {
		return price;
	}
	

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getType() {		
		return this.itemType;
	}

	public double getPromoPrice() {
		return promoPrice;
	}
	
	
}
