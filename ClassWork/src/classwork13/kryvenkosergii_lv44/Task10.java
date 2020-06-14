package classwork13.kryvenkosergii_lv44;

import java.util.concurrent.ThreadLocalRandom;

public class Task10 {

	public static void findNumberOfStepsToGetOne() {

		Long randomLong = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
//		System.out.println(randomLong);
		int counter = 0;
		while (randomLong != 1) {
			if (randomLong % 2 == 0) {
				randomLong = randomLong / 2;
			} else {
				randomLong = randomLong * 3 + 1;
			}
			counter++;
		}
		System.out.println(counter);
	}
}