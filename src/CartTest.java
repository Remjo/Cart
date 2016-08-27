import cart.Cart;
import cart.Item;
import cart.PriceRule;
import cart.PromoCode;
import cart.imp.ShoppingCart;
import cart.imp.ShoppingItem;
import cart.imp.ShoppingRule;


public class CartTest {

	public static void main(String[] args) {
		
		CartTest cartTest = new CartTest();
		
		cartTest.scenario1();
		System.out.println();
		cartTest.scenario2();
		System.out.println();
		cartTest.scenario3();
		System.out.println();
		cartTest.scenario4();
//		System.out.println();
//		cartTest.scenario5();
//		System.out.println();
//		cartTest.scenario6();
//		System.out.println();
//		cartTest.scenario7();
//		System.out.println();
//		cartTest.scenario8();
//		System.out.println();
//		cartTest.scenario9();

	}
	
	
	public void scenario1() {
		
		System.out.println("******* Scenario 1 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 1 End ***********");
	}
	
	public void scenario2() {
		
		System.out.println("******* Scenario 2 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 2 End ***********");
		
	}
	
	public void scenario3() {
		
		System.out.println("******* Scenario 3 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		
		shoppingCart.add(new ShoppingItem(Item.ULT_MEDIUM));
		shoppingCart.add(new ShoppingItem(Item.ULT_MEDIUM));
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 3 End ***********");
	}
	
	
	public void scenario4() {
		
		System.out.println("******* Scenario 4 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		
		shoppingCart.add(new ShoppingItem(Item.ONE_GIGA), PromoCode.TEN_PERCENT_DISCOUNT);
		
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 4 End ***********");
	}
	
	public void scenario5() {
		
		System.out.println("******* Scenario 5 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL), PromoCode.TEN_PERCENT_DISCOUNT );
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		
		shoppingCart.add(new ShoppingItem(Item.ULT_MEDIUM));
		shoppingCart.add(new ShoppingItem(Item.ULT_MEDIUM));
		
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		
		shoppingCart.add(new ShoppingItem(Item.ONE_GIGA));
		shoppingCart.add(new ShoppingItem(Item.ONE_GIGA));
		shoppingCart.add(new ShoppingItem(Item.ONE_GIGA));
		
		//shoppingCart.add(new ShoppingItem(Item.ONE_GIGA), PromoCode.TEN_PERCENT_DISCOUNT);
		
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 5 End ***********");
	}
	
	
	public void scenario6() {
		
		System.out.println("******* Scenario 6 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));	
		
		
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 6 End ***********");
	}
	
	
	public void scenario7() {
		
		System.out.println("******* Scenario 7 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		shoppingCart.add(new ShoppingItem(Item.ULT_SMALL));
		
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 7 End ***********");
	}
	
	
	public void scenario8() {
		
		System.out.println("******* Scenario 8 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));		
		
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 8 End ***********");
	}

	
	public void scenario9() {
		
		System.out.println("******* Scenario 9 Start ***********");
		
		PriceRule pricingRule = new ShoppingRule();
		Cart shoppingCart = new ShoppingCart(pricingRule);
		
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		shoppingCart.add(new ShoppingItem(Item.ULT_LARGE));
		
		
		shoppingCart.displayTotalPrice();
		shoppingCart.displayCheckOutItems();
		
		System.out.println("******* Scenario 9 End ***********");
	}	
	
}
