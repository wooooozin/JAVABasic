package templateMethodPattern;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		Car menualCar = new MenualCar();
		
		aiCar.run();
		menualCar.run();
		
	}

}
