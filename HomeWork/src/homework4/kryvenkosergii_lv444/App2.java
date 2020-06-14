package homework4.kryvenkosergii_lv444;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class App2 {

	public static void main(String[] args) throws IOException {
		int[] num = { 2, -4, 7, 5, 1, 6, 2, 8, 1, 9 };

		// or other method entering in the console
//		int [] num1 = new int [10];
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter 10 integer numbers");
//		for (int i=0; i<10; i++) {
//			System.out.println("Your " + (i+1) + " number is ");
//			String text = br.readLine();
//			num1[i] = Integer.parseInt(text);
//		}

		// Calculate the sum of first 5 elements if they are positive or product of last
		// 5 element in the other case
		int sum = 0;
		int prod = 1;

		for (int i = 0; i < 5; i++) {
			if (num[i] > 0) {
				sum += num[i];
			} else {
				sum = 0;
				break;
			}
		}

		if (sum != 0) {
			System.out.println("Sum of first 5 elements is " + sum);
		} else {
			for (int j = num.length - 1; j > num.length - 6; j--) {
				prod = prod * num[j];
			}
			System.out.println("Product of last 5 element is " + prod);
		}

	}

}
