package practice1;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money = money;
		
		if (money == Menu.STARAMERICANO) {
			return "별 다방 아메리카노를 구입했습니다.";
		}
		else if (money == Menu.STARLATTE) {
			return "별다방 라떼를 주문했습니다.";
		}
		else {
			return null;
		}
		
	}

}
