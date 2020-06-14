package classwork13.kryvenkosergii_lv44;

public class Task12 {

	public static void findSumOfAllMultiplesOf35LessThan1000() {

		int[] array = new int[1000];
		for (int a = 0; a < array.length; a++) {
			array[a] = a + 1;
		}

		int sum = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if ((array[i] % 3 == 0) || (array[i] % 5 == 0)) {
				sum = sum + array[i];
//				System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}