package homework3.kryvenkosergii_lv444;

public class App2 {
	static String nameOldestDog = null;
	static String breedOldestDog = null;
	static int ageOldestDog = 0;

	protected static void check(Dog dog1, Dog dog2, Dog dog3) {

		// Checking the oldest dog
		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			nameOldestDog = dog1.getName();
			ageOldestDog = dog1.getAge();
			breedOldestDog = dog1.breed.getNameBreed();
			System.out.printf("The oldest dog it's %s with breed %s and its age is %d\n", dog1.getName(),
					dog1.getBreed(), dog1.getAge());
		} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			nameOldestDog = dog2.getName();
			ageOldestDog = dog2.getAge();
			breedOldestDog = dog2.breed.getNameBreed();
			System.out.printf("The oldest dog it's %s with breed %s and its age is %d\n", dog2.getName(),
					dog2.getBreed(), dog2.getAge());
		} else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) {
			nameOldestDog = dog3.getName();
			ageOldestDog = dog3.getAge();
			breedOldestDog = dog3.breed.getNameBreed();
			System.out.printf("The oldest dog it's %s with breed %s and its age is %d\n", dog3.getName(),
					dog3.getBreed(), dog3.getAge());
		}

	}

	public static void main(String[] args) {

		Dog dog1 = new Dog("Charly", Breed.Boxer, 4);
		Dog dog2 = new Dog("Frank", Breed.GermanShepherdDog, 8);
		Dog dog3 = new Dog("Melony", Breed.Rottweiler, 5);

		check(dog1, dog2, dog3);

	}

}
