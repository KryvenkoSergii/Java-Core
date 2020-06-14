package homework3.kryvenkosergii_lv444;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class App2Test {

	@Test // test class App2 - name and the kind of the oldest dog
	void testChecOldestDog() {
		Dog dog1 = new Dog("Danny", Breed.Boxer, 10);
		Dog dog2 = new Dog("Jerry", Breed.GermanShepherdDog, 20);
		Dog dog3 = new Dog("Luci", Breed.Rottweiler, 8);
		String actualName = "Jerry";
		int actualAge = 20;
		App2.check(dog1, dog2, dog3);
		assertSame(actualName, App2.nameOldestDog);
		assertEquals(actualAge, App2.ageOldestDog);
	}

	@Test // checking Enum name of breed
	public void testEnumNameOfBreed() {
		String actualDalmatian = "Dalmatian";
		assertSame(actualDalmatian, Breed.Dalmatian.getNameBreed());
	}

}
