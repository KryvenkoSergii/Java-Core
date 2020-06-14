package homework8.kryvenkosergii_lv444;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class App1 {

	public static double div(double num1, double num2) {
		return num1 / num2;
	}

	public static int readNumber(int start, int end) {
		Scanner scn = new Scanner(System.in);
		System.out.printf("Enter number in the range [%s...%s]", start, end);
		int number = scn.nextInt();
		if (start < number && number < end) {
			return number;
		} else {
			System.out.println("Your number out of range");
			return 0;
		}
	}

	public static void main(String[] args) {

		// 1. input 2 double numbers and call this method. Catch all exceptions.
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Enter first double number");
			double number1 = scn.nextDouble();
			System.out.println("Enter second double number");
			double number2 = scn.nextDouble();
			System.out.println(App1.div(number1, number2));
		} catch (NumberFormatException | InputMismatchException | NullPointerException e) {
			System.out.println("wrong number " + e.getMessage());
		} finally {
			scn.close();
		}

		// 2. enter 10 numbers in the range [start...end]
		int start = 1;
		int end = 100;
		int quantity = 10;
		int[] num = new int[10];
		for (int i = 0; i < quantity; i++) {
			try {
				num[i] = App1.readNumber(start, end);
			} catch (InputMismatchException | NumberFormatException e) {
				System.err.println("Your number is non numeric value. " + e.getMessage());
			}
		}

		for (int i : num) {
			System.out.print(i + " ");
		}

	}

}
