package classwork6.kryvenkosergii_lv44;

public class App2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Person[] pers = new Person[3];
		pers[0] = new Student("John");
		pers[1] = new Teacher("Bob");
		pers[2] = new Cleaner("Sally");

		for (int i = 0; i < pers.length; i++) {
			pers[i].Print();
//			System.out.println(pers[i] instanceof Staff);			
			if (pers[i] instanceof Staff) {
				((Staff) pers[i]).Salary();
			}
		}
		
		((Staff)pers[1]).getTypePerson();
		System.out.println(((Staff)pers[1]).TYPE_PERSON);

	}

}
