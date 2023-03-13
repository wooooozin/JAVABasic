package memberVariable;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(100, "Loopy"); // Student 타입의 student1 객체를 생성
		student1.studentAddress = "Seoul";
		
		Student student2 = new Student(101, "Zanmaang");
		student2.studentAddress = "Busan";
		
		Student student3 = new Student(102, "Hoyki", "Seoul");
		
		student1.showStudentInfo(); // Loopy,Seoul
		student2.showStudentInfo(); // Zanmang,Busan
		student3.showStudentInfo(); // 102,Hoyki,Seoul
		
		System.out.println(student1); // memberVariable.Student@주
		System.out.println(student2); // memberVariable.Student@251a69d7
	}

}
