package breakContinue;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for (num = 1; num <=100; num++) {
			if ((num % 3) != 0) {
				continue; // 1, 2일 때는 다시 반복문으로 
			}
			System.out.println(num);
		}
		
	}

}
