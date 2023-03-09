package forStatement;

public class ForStatementTest {
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for (int i = 0; i < 10; i++, count++) { // 10
			sum += count;
			System.out.println("count " + sum);
		}
		System.out.println(sum); // 55
		System.out.println(count); // 11
		
		int num = 1;
		int total = 0;
		
		while( num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total); // 55

	}
}
