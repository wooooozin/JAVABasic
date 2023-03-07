package ifStatement;

import java.util.Scanner;

public class IfElseElseTest {

	public static void main(String[] args) {

		int age;
		int charge;

		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		scanner.close();
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중/고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		
		System.out.println("요금:" + charge);
	}

}
