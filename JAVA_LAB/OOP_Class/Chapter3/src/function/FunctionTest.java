package function;

public class FunctionTest {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세여");
		
		int sum = calcSum();
		System.out.println(sum);
	}
	
	// return 값이 있음
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	// return 값이 없음
	public static void sayHello(String str) {
		System.out.println(str);
	}
	
	// return 값이 있고 매개변수가 없음
	public static int calcSum() {
		int i;
		int sum = 0;
		
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

}
