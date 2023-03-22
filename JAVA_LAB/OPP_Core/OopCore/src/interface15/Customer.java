package interface15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("sell");
	}

	@Override
	public void buy() {
		System.out.println("buy");		
	}

	public void logOut() {
		System.out.println("사용자가 로그아웃 함.");
	}

	@Override
	public void order() {
		// 같은 이름의 메서드가 중복되 때문에
		Buy.super.order();
		// 또는
//		Sell.super.order();
		// 둘중 하나 사용해서 오버라이드 하거나 둘다 사용하거나 
	}
	

}
