package singletonePattern;

import java.util.Calendar;

public class SchoolTest {

	public static void main(String[] args) {
		
		School school1 = School.getInstane();
		School school2 = School.getInstane();
		
		System.out.println(school1 == school2);
		
//		Calendar calendar = new Calendar(); - 에러
		Calendar c = Calendar.getInstance(); // OK
	}

}
