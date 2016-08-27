package cart;

public interface Item {
	
	public String ULT_SMALL = "ULT_SMALL";
	public String ULT_MEDIUM = "ULT_MEDIUM";
	public String ULT_LARGE = "ULT_LARGE";
	public String ONE_GIGA = "ONE_GIGA";
	public String ULT_LARGE_PROMO = "ULT_LARGE_PROMO";
	
	public String getType();
	
	public double getPrice();
	
	public double getPromoPrice();
	

}
