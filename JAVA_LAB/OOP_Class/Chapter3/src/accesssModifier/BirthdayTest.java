package accesssModifier;

public class BirthdayTest {

	public static void main(String[] args) {
		
		Birthday day = new Birthday();
		day.setDay(2023);
		day.setMonth(3);
		day.setDay(30);

		System.out.println(day.isValid()); // true
		
		System.out.print(day);
		day.printThis();
	}

}
