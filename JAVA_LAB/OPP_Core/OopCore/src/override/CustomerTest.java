package override;

public class CustomerTest {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		int cost = customerLee.calcPrice(price);
				
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		int vipCost = customerKim.calcPrice(price);
		
		System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + cost);
		System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + vipCost);
		
		Customer customerPark = new VipCustomer();
		customerPark.setCustomerName("PARK");
		int newCost = customerPark.calcPrice(price);
		System.out.println(customerPark.showCustomerInfo() + " 지불 금액은 " + newCost);
	
	}

}
