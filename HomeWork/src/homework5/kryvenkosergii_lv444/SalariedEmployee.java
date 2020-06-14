package homework5.kryvenkosergii_lv444;

public class SalariedEmployee extends Employee implements Pay {

	private int hourlyRate;
	private int socialSecurityNumber;
	private int hours;
	private String employeeld;

	@Override
	public int calculatePay() {
		return hourlyRate*hours;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public int getSalary() {
		return calculatePay();
	}

	public SalariedEmployee() {

	}

	public SalariedEmployee(String employeeld, int socialSecurityNumber, int hourlyRate, int hours) {
		this.hourlyRate = hourlyRate;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
		this.employeeld = employeeld;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber= " + socialSecurityNumber + ", employeeld= " + employeeld
				+ ", hourlyRate= " + hourlyRate + ", salary= " + calculatePay() + "]";
	}

}
