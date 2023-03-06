package operator;

public class OperatorTest {

	public static void main(String[] args) {
			
		int total = 10;
		int add = 20;
		
		total += add;
		System.out.println(total); // 30
		
		int a = 1;
		int b;
		++a; // a = a + 1, 단항연산자
		System.out.println(a); // 2
		
		a = 0;
		b = ++a; //a도 1 증가 
		System.out.println(b); // 1
		System.out.println(a); // 1

		int gameScore = 100;
		int myScore;
		
		myScore = ++gameScore; 
		System.out.println(myScore + "," + gameScore); // 101, 101
		// 1이 먼저 증가하고 myScore에 1+gameScore(100) 대입
		
		gameScore = 100;
		myScore = gameScore++;
		System.out.println(myScore + "," + gameScore); // 100, 101
		// gameSore(100)를 먼저 대입하고 gameScore 1 증가
	}

}
