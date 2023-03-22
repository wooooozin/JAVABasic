package interface15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.sell();
		customer.buy();
		
		customer.logOut();
		
		Buy buyer = new Customer();
//		buyer.sell(); - 불가
		buyer.buy();
		
		Sell seller = new Customer();
//		seller.buy(); - 불가
		seller.sell();
	}

}
