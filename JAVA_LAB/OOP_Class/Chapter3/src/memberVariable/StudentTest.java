package memberVariable;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(); // Student 타입의 student1 객체를 생성
		student1.studentName = "Loopy";
		student1.studentAddress = "Seoul";
		
		Student student2 = new Student();
		student2.studentName = "Zanmang";
		student2.studentAddress = "Busan";
		
		student1.showStudentInfo(); // Loopy,Seoul
		student2.showStudentInfo(); // Zanmang,Busan
		
		System.out.println(student1); // memberVariable.Student@주
		System.out.println(student2); // memberVariable.Student@251a69d7
	}

}
