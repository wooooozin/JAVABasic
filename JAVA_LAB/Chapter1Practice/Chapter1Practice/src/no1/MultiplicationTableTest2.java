package no1;

public class MultiplicationTableTest2 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요
		
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= dan; times++) {
				System.out.println(dan + " X " + times + " = " + (dan * times));
			}
		}
		System.out.println();
	}

}
