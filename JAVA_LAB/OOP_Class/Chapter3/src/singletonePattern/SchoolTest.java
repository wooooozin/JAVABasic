package singletonePattern;

public class SchoolTest {

	public static void main(String[] args) {
		
		School school1 = School.getInstane();
		School school2 = School.getInstane();
		
		System.out.println(school1 == school2);
		
		
	}

}
