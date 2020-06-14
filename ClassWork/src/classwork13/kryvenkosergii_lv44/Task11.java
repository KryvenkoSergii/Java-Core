package classwork13.kryvenkosergii_lv44;

public class Task11 {

	public static void checkIfCreditCardIsValid(String cardNumber) {

		int[] numbersOfCard = new int[cardNumber.length()];
		for (int i = 0; i < cardNumber.length(); i++) {
			numbersOfCard[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
		}
		for (int i = numbersOfCard.length - 2; i >= 0; i = i - 2) {
			int j = numbersOfCard[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			numbersOfCard[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < numbersOfCard.length; i++) {
			sum = sum + numbersOfCard[i];
		}
		if (sum % 10 == 0) {
			System.out.println(cardNumber + " is a valid credit card number");
		} else {
			System.out.println(cardNumber + " is an invalid credit card number");
		}
	}

	public static void callingMethodToCheckIt() {

		checkIfCreditCardIsValid("4929421234600812");
		checkIfCreditCardIsValid("4929421234600821");

	}
}