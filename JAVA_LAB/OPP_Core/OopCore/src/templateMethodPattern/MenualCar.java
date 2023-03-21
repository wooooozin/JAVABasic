package templateMethodPattern;

public class MenualCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아 멈춥니다.");
	}
	
	@Override
	public void fuel() {
		System.out.println("연료를 충전합니다.");
	}
	
	public void washCar() {
		System.out.println("손 세차를 합니다.");
	}

}
