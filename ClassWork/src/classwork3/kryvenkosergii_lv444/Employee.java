package classwork3.kryvenkosergii_lv444;

class Employee {
	private String name = null;
	private double rate = 0;
	private int hours = 0;

	private static double totaslSum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static double getTotaslSum() {
		return totaslSum;
	}

	public static void setTotaslSum(double totaslSum) {
		Employee.totaslSum = totaslSum;
	}

	public Employee() {

	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public double getSalary() {
		totaslSum = totaslSum + (double) this.rate * this.hours;
		return this.rate * this.hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", getSalary()=" + getSalary() + "]";
	}

	public double changeRate(double rate) {
//		this.rate = rate;
//		double salary = getSalary();
		return getSalary();
	}

	public double getBonuses() {
		return this.rate * this.hours + getSalary() * 0.1;
	}

}
