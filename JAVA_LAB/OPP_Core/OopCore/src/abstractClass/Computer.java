package abstractClass;

public abstract class Computer {
	
	public abstract void display(); // 하위 클래스에게 위임
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
