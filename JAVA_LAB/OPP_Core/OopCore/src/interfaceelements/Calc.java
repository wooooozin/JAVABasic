package interfaceelements;

public interface Calc {
	
	public static final double PI = 3.14;
	int ERROR = -99999999;

	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		myMethod();
		myStaticMethod();
		System.out.println("정수를 계산합니다.");
	}
	
	static int total(int[] arr) {
		myStaticMethod();
		int total = 0;
		
		for (int i : arr) {
			total += i;
		}
		
		return total;
	}
	
	private void myMethod() { // static메서드 내부에서는 사용할 수 없음;
		System.out.println("private my method");
	}
	
	private static void myStaticMethod() {
		System.out.println("private my static method");
	}
	
}
