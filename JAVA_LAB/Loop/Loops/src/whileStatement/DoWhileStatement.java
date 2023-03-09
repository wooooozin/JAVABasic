package whileStatement;

import java.util.Scanner;

public class DoWhileStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			System.out.print("num: ");
			input = scanner.nextInt();
			sum += input;
		} while (input != 0);
		
		System.out.println(sum);
		
	}

}
