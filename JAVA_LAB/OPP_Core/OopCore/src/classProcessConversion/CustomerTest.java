package classProcessConversion;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
				
		VipCustomer customerKim = new VipCustomer(10020, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		
		Customer vCustomer = new VipCustomer(10030,"야옹이");
		
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
