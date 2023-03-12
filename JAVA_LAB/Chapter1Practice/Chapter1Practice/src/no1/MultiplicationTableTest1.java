package no1;

public class MultiplicationTableTest1 {

	public static void main(String[] args) {
		// 구구단을 짝수 단만 출력하도록 프로그램을 만들어 모세요 (continue문 사용)
		 
		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				continue;
			}
			
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
	}

}
