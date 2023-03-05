package charater;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1); // A
		System.out.println((int)ch1); // 65
		
		char ch2 = 66;
		System.out.println(ch2); // B
		
		char ch3 = '한';
		char ch4 = '\uD55C';
		char ch5 = '\uAC00';
		System.out.println(ch3); // 한
		System.out.println(ch4); // 한
		System.out.println(ch5); // 
		

	}

}
