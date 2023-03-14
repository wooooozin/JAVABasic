package staticKeyword;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("잔망루피");
		
//		System.out.println(employeeLee.serialNum); // 1001
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("뽀로로");
		
//		employeeKim.serialNum++;
		
//		System.out.println(employeeLee.serialNum); // 1003
//		System.out.println(employeeKim.serialNum); // 1003
		
		
		System.out.println(employeeLee.getEmployeeId()); // 1000
		System.out.println(employeeKim.getEmployeeId()); // 1001
		System.out.println(Employee.getSerialNum());
		
		
	}

}
