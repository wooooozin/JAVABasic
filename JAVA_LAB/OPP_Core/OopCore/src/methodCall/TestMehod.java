package methodCall;

public class TestMehod {

	int num;
	
	void aaa() {
		System.out.println("aaa() 호출");
	}
	
	public static void main(String[] args) {
		
		TestMehod a1 = new TestMehod();
		a1.aaa();
		
		TestMehod a2 = new TestMehod();
		a2.aaa();
	}

}
