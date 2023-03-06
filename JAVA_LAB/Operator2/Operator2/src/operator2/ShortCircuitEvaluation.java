package operator2;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value;
		value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2 
		// 단락 평가 - 앞의 항이 false로 판단되어 논리곱 연산자 뒤의 항은 연산하지 않아 i는 원래 값인 2로 나
		
		value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2 
		
		
	}

}
 