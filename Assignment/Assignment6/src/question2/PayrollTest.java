package question2;

public class PayrollTest {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		
		emp[0] = new SalariedEmployee("shri", "Patil", "111", 5000);
		emp[1] = new HourlyEmployee("john", "Patel", "112", 500, 45);
		emp[2] = new CommissionEmployee("BOb", "smith", "113", 3, 1200);
		emp[3] = new BaseplusCommissionEmployee("Jue", "Khan", "114", 3, 1200, 300);
		
		for (Employee employee : emp) {
			System.out.println(employee);
			System.out.println("Earned: " + employee.earnings());
			
		}
		

	}

}
