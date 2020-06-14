package classwork5.kryvenkosergii_lv44;

public class App1 {

	static int getBigNumber(int number[]) {
		int bigNumber = number[0];
		for (int i = 0; i < number.length; i++) {
			if (bigNumber < number[i]) {
				bigNumber = number[i];
			}
		}
		return bigNumber;
	}

	static int getSumPosNumber(int number[]) {
		int sumPosNumber = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0) {
				sumPosNumber += number[i];
			}
		}
		return sumPosNumber;
	}

	static int getNegativCount(int number[]) {
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				count++;
			}
		}
		return count;
	}

	static int getValuePosOrNeg(int number[]) {
		int valuePos = 0;
		int valueNeg = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				valueNeg += number[i];
			} else {
				valuePos += number[i];
			}
		}

		return (valuePos > -valueNeg ? valuePos : valueNeg);
	}

	public static void main(String[] args) {
		int[] num1 = { 5, 25, 7 };
		System.out.println("Your biggest number is " + getBigNumber(num1));

		int[] num2 = { 5, -30, 25, 0, -5, 6 };
		System.out.println("Your sum of positive numbers is " + getSumPosNumber(num2));

		int[] num3 = { 5, -30, 25, 0, -5, 6, -5, 6, -7 };
		System.out.println("Your amount of negative numbers is " + getNegativCount(num3));

		System.out.println("Value is more " + getValuePosOrNeg(num3));

	}

}
