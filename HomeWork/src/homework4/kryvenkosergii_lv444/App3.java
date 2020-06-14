package homework4.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App3 {

	public static void main(String[] args) throws IOException {
//		int[] num1 = { 2, 4, 7, 1, 5 }; // array for test
		int[] num1 = new int[5];
		int count = 0;
		int pos1 = 0; // position of second positive number
		int min;
		int pos2 = 0; // position min number
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 integer numbers");
		for (int i = 0; i < 5; i++) {
			System.out.println("Your " + (i + 1) + " number is ");
			String text = br.readLine();
			num1[i] = Integer.parseInt(text);

			// position of second positive number
			if (num1[i] > 0 && count < 2) {
				pos1 = i;
				count++;
			}

		}
		System.out.println("position of second positive number is " + (pos1 + 1));

		// minimum and its position in the array
		min = num1[0];
		for (int i = 0; i < 5; i++) {
			if (num1[i] < min) {
				min = num1[i];
				pos2 = i;
			}
		}
		System.out.println("minimum number is " + min + " and its position in the array is " + (pos2 + 1));

		// Organize entering integers until the first negative number.
		int[] num2 = new int[10];
		int prod = 1;

		System.out.println("Enter integer numbers");
		for (int i = 0; i < 10; i++) {
			System.out.println("Your " + (i + 1) + " number is ");
			String text = br.readLine();
			num2[i] = Integer.parseInt(text);
			if (num2[i] % 2 == 0) {
				prod = prod * num2[i];
			}
			if (num2[i] <= 0) {
				System.out.println("You entered a negative or '0' number. Entering stoped.");
				break;
			}
		}
		System.out.println("product of all entered even numbers is " + prod);
	}

}
