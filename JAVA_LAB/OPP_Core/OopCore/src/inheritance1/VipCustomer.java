package inheritance1;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer() {
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

}
