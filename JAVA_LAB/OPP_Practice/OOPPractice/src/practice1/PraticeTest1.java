package practice1;

public class PraticeTest1 {
	
	public static void main(String[] args) {
		
		Person personKim = new Person("Kim", 10000);
		Person personLee = new Person("Lee", 10000);
		
		StarCoffee starCoffe = new StarCoffee();
		BeanCoffee beanCoffe = new BeanCoffee();
		
		personKim.buyStarCoffee(starCoffe, Menu.STARAMERICANO);
		personLee.buyBeanCoffee(beanCoffe, Menu.BEANLATTE);
		
	}

}
