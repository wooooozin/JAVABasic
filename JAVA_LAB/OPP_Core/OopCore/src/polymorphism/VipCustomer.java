package polymorphism;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIP Customer() call");
	}
	
	public int getAgentID() {
		return agentID;
	}

}
