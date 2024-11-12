class Employe {
	private String firstName; 
	private String lastName; 
	private double monthlySalary;
	
	public Employe(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public double  getMonthlySalary() {
		return monthlySalary;
		
	}
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
		
	}
	
	public double getYearlySalary() {
		return monthlySalary * 12;
	}
	
	public void raiseSlary(double raise_percentage) {
		if (raise_percentage > 0) {
			monthlySalary = monthlySalary + monthlySalary * (raise_percentage / 100);
		}
	}
	
	
	
	
}


public class Question2 {

	public static void main(String[] args) {
		Employe emp1 = new Employe("ABC", "abc", 50000);
		Employe emp2 = new Employe("XYZ", "xyz", 70000);
		
		System.out.println("yearlySalary of Employee1 : " + emp1.getYearlySalary());
		System.out.println("yearlySalary of Employee2 : " + emp2.getYearlySalary());
		
		emp1.raiseSlary(10.0);
		emp2.raiseSlary(20);
		
		System.out.println("\nSalary after raise percentage");
		System.out.println("yearlySalary of Employee1 : " + emp1.getYearlySalary());
		System.out.println("yearlySalary of Employee2 : " + emp2.getYearlySalary());
		
		
		

	}

}
