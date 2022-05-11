public class Employee extends Person {
	private double annualSalary;
	private String nationalInsuranceNo;
	
	public Employee(double annualSalary, String nationalInsuranceNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}


	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Employee [annualSalary=" + annualSalary + yearOfJoining + ", nationalInsuranceNo="
				+ nationalInsuranceNo + ", name=" + name + "]";
	}
	
	
}