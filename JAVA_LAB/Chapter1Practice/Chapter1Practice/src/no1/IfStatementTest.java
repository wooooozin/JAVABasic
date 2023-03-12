package no1;

import java.util.Scanner;

public class IfStatementTest {
	/*
	 * 다음 조건식을 조건문(if문)으로 바꾸어보세요
	 * grade = (sore >= 90) ? 'A' : 'B';
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char grade;
		int score = sc.nextInt();
		sc.close();
				
		if (score >= 90) {
			grade = 'A';
			System.out.println(grade);
		}
		else {
			grade = 'B';
			System.out.println(grade);
		}
	}

}
