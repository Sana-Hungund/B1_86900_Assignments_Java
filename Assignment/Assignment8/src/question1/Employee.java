package question1;

public class Employee {
	private int id;
	private String name;
	private double Salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.Salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return Salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	

}
