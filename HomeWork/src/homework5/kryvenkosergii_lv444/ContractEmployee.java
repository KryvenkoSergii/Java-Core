package homework5.kryvenkosergii_lv444;

public class ContractEmployee extends Employee implements Pay {

	private int fixedRate;
	private int federalTaxIdmember;
	private String employeeld;


	@Override
	public int calculatePay() {
		return fixedRate;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public int getSalary() {
		return calculatePay();
	}

	public ContractEmployee() {

	}

	public ContractEmployee(String employeeld, int federalTaxIdmember, int fixedRate) {
		this.fixedRate = fixedRate;
		this.federalTaxIdmember = federalTaxIdmember;
		this.employeeld = employeeld;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember= " + federalTaxIdmember + ", employeeld= " + employeeld
				+ ", fixedRate= " + fixedRate + "]";
	}

}
