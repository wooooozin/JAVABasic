package classProcessConversion;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
		System.out.println("VIP Customer() call");
	}
	
	public int getAgentID() {
		return agentID;
	}

}
