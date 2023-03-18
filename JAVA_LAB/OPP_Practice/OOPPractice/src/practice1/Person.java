package practice1;

public class Person {

	String name;
	int money;
	
	Person(String name, int money) {
		this.name = name;
		this.money = money;
		
	}
	
	public void buyStarCoffee(StarCoffee sCoffe, int money) {
		String message = sCoffe.brewing(money);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money +"으로 " + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffe, int money) {
		String message = bCoffe.brewing(money);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money +"으로 " + message);
		}
	}
	
}
