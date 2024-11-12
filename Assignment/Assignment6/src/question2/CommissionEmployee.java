package question2;

public class CommissionEmployee extends Employee {
	private int grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String ssn, int grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public double earnings() {
		return commissionRate * grossSales;
	}

	@Override
	public String toString() {
		return "Commission Employee " + super.toString() + " grossSales " + grossSales + " commissionRate " + commissionRate;
	}

}
