package ifStatement;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		int age;

		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		scanner.close();
		
		if( age >= 8) {
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}

	}

}
