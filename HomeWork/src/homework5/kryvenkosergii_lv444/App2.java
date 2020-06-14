package homework5.kryvenkosergii_lv444;

public class App2 {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new SalariedEmployee("Bob", 10, 5, 10);
		emp[1] = new ContractEmployee("Jim", 245255587, 70);
		emp[2] = new SalariedEmployee("Lycie", 3, 15, 6);
		emp[3] = new ContractEmployee("Freddie", 678651327, 86);

		Employee tmp = emp[0];
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {

				if (emp[i].getSalary() < emp[j].getSalary()) {
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		}

		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}

	}

}
