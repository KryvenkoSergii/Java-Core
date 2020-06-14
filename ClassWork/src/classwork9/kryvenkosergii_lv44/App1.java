package classwork9.kryvenkosergii_lv44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {

	// Create a method for calculating the area of a rectangle which should throw an
	// exception if the user enters negative value
	public static int squareRectangle(int a, int b) throws ArithmeticException, NumberFormatException{
		if (a < 0.0 || b < 0.0)
			throw new ArithmeticException();
		if (a == 0 || b == 0) 
			throw new NumberFormatException();
		return a * b;

	}

	public static void main(String[] args) throws NumberFormatException{
		Scanner scn = new Scanner (System.in);
//		int a = 5;
//		int b = -6;
		try {
			System.out.println("Enter size first side of rectangle");
			int a = scn.nextInt();
			System.out.println("Enter size second side of rectangle");
			int b = scn.nextInt();
			App1.squareRectangle(a, b);
		} catch (ArithmeticException e) {
			System.out.println("Your one number below zero");
		} catch (NumberFormatException |InputMismatchException e) {
			System.out.println("Your one number is non numeric value or equals zero");
		}
		finally {
			scn.close();
		}

	}

}
