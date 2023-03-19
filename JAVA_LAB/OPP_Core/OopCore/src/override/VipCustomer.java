package override;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer() {
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 아이디는 " + agentID;
	}
	

}
