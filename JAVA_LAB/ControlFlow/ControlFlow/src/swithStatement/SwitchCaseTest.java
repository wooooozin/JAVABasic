package swithStatement;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		int month;
		int day = 0;
		
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		scanner.close();
		
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4: case 6: case 11:
				day = 30;
				break;
			default:
				System.out.println("error");
		}
		System.out.println(month + "월은 " + day + "일 까지 있습니다.");
	}

}
