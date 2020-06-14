package homework2.kryvenkosergii_lv444;

public class InfoAboutPerson {

	public static void main(String[] args) {
		Person[] pers = new Person[5];

		pers[0] = new Person("Vasya", "Pupkin", 1980); // friendly and sociable man
		pers[1] = new Person("Ivan", "Durak", 1982); // shy and unsociable man
		pers[2] = new Person("Igor", "Rak", 1985); // intelligent and hardworking man
		pers[3] = new Person("Mark", "Rid", 1995); // young and active man
		pers[4] = new Person("John", "Torn", 1998); // lazy and unfriendly man

		// input information about persons
		for (int i = 0; i < pers.length; i++) {
			pers[i].input();
		}

		// output information about persons
		for (int i = 0; i < pers.length; i++) {
			System.out.println(pers[i].output());
		}

	}

}
