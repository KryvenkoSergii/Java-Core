package classwork13.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classwork4.kryvenkosergii_lv44.Continents;

public class AppGroup {

	public static void main(String[] args) throws IOException {
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of task");
		String text = br.readLine();

		switch (text) {
		case "1":
			System.out.println("Input number ");
			String text1 = br.readLine();
			num = Integer.parseInt(text1);
			Task1.getNumber(num);
			break;

//		case "2":
//			System.out.println("Input number ");
//			String text2 = br.readLine();
//			num = Integer.parseInt(text2);
//			Task2.;
//			break;

		case "3":
			System.out.println("Enter cost of dollar");
			int dollar = Integer.parseInt(br.readLine());
			System.out.println("Enter sum of gryvna");
			int grivna = Integer.parseInt(br.readLine());
			System.out.println("You can buy "+(int)Task3.calculate(dollar, grivna)+" dollar");
			break;

		case "4":
			System.out.println("Input string ");
			String text5 = br.readLine();
			Task4.CalculateWords(text5);
			break;

		case "5":
			System.out.println("Input string ");
			String text6 = br.readLine();
			Task5.checkPalindrom(text6);
			break;

		case "6":
			System.out.println("Input string ");
			String text7 = br.readLine();
			Task6.countWords(text7);
			break;

//		case "7":
//			System.out.println("");
//			break;
//
//		case "8":
//			System.out.println("");
//			break;

		case "9":
			System.out.println("Input number ");
			String text10 = br.readLine();
			num = Integer.parseInt(text10);
			Task9.randomValue(num);
			break;

		case "10":
			Task10.findNumberOfStepsToGetOne();
			break;

		case "11":
			System.out.println("Enter the credit card number ");
			String text12 = br.readLine();
			Task11.checkIfCreditCardIsValid(text12);
			break;

		case "12":
			Task12.findSumOfAllMultiplesOf35LessThan1000();
			break;

		case "13":
			Task13 task13 = new Task13();
			task13.NCK();
			break;

		case "14":
			System.out.println("Enter quattity of pens ");
			String text14 = br.readLine();
			num = Integer.parseInt(text14);
			Task14.countWaysGivenAmountOfMoney(num);
			break;
		}
	}
}
