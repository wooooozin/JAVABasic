package operand3;

public class BitTest {

	public static void main(String[] args) {

		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2); // 둘다 0일 때 0 -> 00001111 -> 15
		System.out.println(num1 & num2); // 둘다 1일 때 1 -> 00000000 -> 0
		System.out.println(num1 ^ num2); // 두개가 다를 때 1 -> 00001111 -> 15
		System.out.println(~num1); // 비트의 반전 -> 1의 보수 -> -6
		int num3 = 0b11111010;
		System.out.println(num3);
		
		System.out.println(num1 << 2); // 2의 n승 곱하기 -> 20
		System.out.println(num1); // 대입 연산자 안써서 num1은 그대로 5
		System.out.println(num1 <<= 2); // 2의 n승 곱하기 -> 20
		System.out.println(num1); // 대입연산자 써서 num1 20

	}

}
