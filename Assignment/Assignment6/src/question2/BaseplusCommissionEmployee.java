package question2;

public class BaseplusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BaseplusCommissionEmployee(String firstName, String lastName, String ssn, int grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public double earnings() {
		return super.earnings() + baseSalary;
	}

	@Override
	public String toString() {
		return "base salaried " + super.toString() + " baseSlary " + baseSalary;
	}

}
