package no1;

import java.util.Scanner;

public class DiamondTest {

	public static void main(String[] args) {
		// 조건문과 반복문을 활용하여 다이아몬드를 출력해 보세요
		
		Scanner scanner = new Scanner(System.in);
		
		int lineCount = scanner.nextInt(); 
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
	}

}
