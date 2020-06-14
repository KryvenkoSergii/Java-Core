package classwork4.kryvenkosergii_lv44;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int numOdd = 0;
		int num1, num2, num3;
	
		System.out.print("Enter first number ");
		Scanner scn = new Scanner(System.in);
		num1 = scn.nextInt();
		if (num1 % 2 == 0) {
			numOdd++;
		}
		
		System.out.print("Enter second number ");

		num2 = scn.nextInt();
		if (num2 % 2 == 0) {
			numOdd++;
		}
		
		System.out.print("Enter third number ");
	
		num3 = scn.nextInt();
		if (num3 % 2 == 0) {
			numOdd++;
		}

		System.out.printf("You entered %d odd numbers\n", numOdd);
		scn.close();
	
	}

}
