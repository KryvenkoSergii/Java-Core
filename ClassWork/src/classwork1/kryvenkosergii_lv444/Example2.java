package classwork1.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your first number");
		String text1 = br.readLine();
		int num1 = Integer.parseInt(text1);

		System.out.println("Enter your second number");
		String text2 = br.readLine();
		int num2 = Integer.parseInt(text2);

		System.out.println("Result num1 + num2 is " + (num1 + num2));
		System.out.println("Result num1 - num2 is " + (num1 - num2));
		System.out.println("Result num1 * num2 is " + num1 * num2);
		System.out.println("Result num1 / num2 is " + (num1/num2));

	}

}
