package referenceVariable;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLoopy = new Student(100, "Loopy");
		Student studentZanmang = new Student(101, "Zanmang");
		
		studentLoopy.setKoreanSubject("국어", 100);
		studentLoopy.setMathSubject("수학", 95);
		
		studentZanmang.setKoreanSubject("국어", 80);
		studentZanmang.setMathSubject("수학", 99);
		
		studentLoopy.showStudentScore();
		studentZanmang.showStudentScore();
		
//		System.out.println(studentLoopy.getStudentId());
		
	}

}
