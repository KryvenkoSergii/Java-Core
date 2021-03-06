package classwork5.kryvenkosergii_lv44;

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}
	
	private String name = null;
	private int departmentNumber = 0;
	private int salary = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		
	}
	public Employee(String name, int departmentNumber, int salary) {
		
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	

}
