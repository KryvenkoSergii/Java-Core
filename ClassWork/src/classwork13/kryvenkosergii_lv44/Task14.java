package classwork13.kryvenkosergii_lv44;

public class Task14 {

	public static void countWaysGivenAmountOfMoney (int pence) {
		int twoPound = pence/200;
		int fullPound = pence/100;
		int halfPound = pence/50;
		int quarters = pence/20;
		int nickels = pence/5;
		int twoCents = pence/2;
		int cents=1;
		System.out.println("different ways we can be made is: " + (twoPound+fullPound+halfPound+quarters+nickels+twoCents+cents));
		
	}
}
