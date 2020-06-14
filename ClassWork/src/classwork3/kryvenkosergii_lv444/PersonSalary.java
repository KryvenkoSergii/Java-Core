package classwork3.kryvenkosergii_lv444;

public class PersonSalary {

	public static void main(String[] args) {
		Employee person1 = new Employee("Oleg", 2.1, 5);
		System.out.println(person1.toString());
		System.out.println("Earn with Bonuse to " + person1.getName() + " is " + person1.getBonuses());
		
		Employee person2 = new Employee("Vasya", 3.2, 8);
		System.out.println(person2.toString());
		System.out.println("Earn with Bonuse to " + person2.getName() + " is " + person2.getBonuses());
		
		Employee person3 = new Employee("Ivan", 5.6, 10);
		System.out.println(person3.toString());
		System.out.println("Earn with Bonuse to " + person3.getName() + " is " + person3.getBonuses());

	}

}
