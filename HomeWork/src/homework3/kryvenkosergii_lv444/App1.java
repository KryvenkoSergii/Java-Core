package homework3.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {

	public static void main(String[] args) throws IOException {

		// checking range float numbers
		float[] numF = new float[3];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 float numbers which are they belong to the range [-5,5]");
		for (int i = 0; i < 3; i++) {
			System.out.printf("Your %d number is \n", i + 1);
			String text1 = br.readLine();
			numF[i] = Float.parseFloat(text1);
			if (numF[i] > 5 || numF[i] < -5) {
				System.out.printf("Number %f isn't belong to the range [-5,5]\n", numF[i]);
				break;
			}
		}

		CheckNumber checkNumberFloat = new CheckNumber(numF[0], numF[1], numF[2]);
		System.out.println(checkNumberFloat.getNumberF1() + " " + checkNumberFloat.getNumberF2() + " "
				+ checkNumberFloat.getNumberF3());

		// checking int number and determine min and max
		int[] numI = new int[3];

		System.out.println("Enter 3 integer numbers");
		for (int i = 0; i < 3; i++) {
			System.out.printf("Your %d number is \n", i + 1);
			String text2 = br.readLine();
			numI[i] = Integer.parseInt(text2);
		}
		System.out.println(numI[0] + " " + numI[1] + " " + numI[2]);
		CheckNumber checkNumberInteger = new CheckNumber(numI[0], numI[1], numI[2]);
		System.out.println("max number is " + checkNumberInteger.getMaxNumberI());
		System.out.println("min number is " + checkNumberInteger.getMinNumberI());

		// name of HTTPError
		System.out.println("Enter number of HTTP Error");
		String text3 = br.readLine();
		int num = Integer.parseInt(text3);

		switch (num) {
		case 400:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR400.getNameError());
			break;
		case 401:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR401.getNameError());
			break;
		case 402:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR402.getNameError());
			break;
		case 403:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR403.getNameError());
			break;
		case 404:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR404.getNameError());
			break;
		case 405:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR405.getNameError());
			break;
		case 406:
			System.out.println("The name of this HTTP error it's " + HTTPError.ERROR406.getNameError());
			break;

		}

	}

}
