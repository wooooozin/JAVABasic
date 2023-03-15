package singletonePattern;

public class School {
	
	private static School instance = new School();
	private School() { }
	
	public static School getInstane() {
		if (instance == null) {
			instance = new School();
		}
		return instance;
	}
	

}
