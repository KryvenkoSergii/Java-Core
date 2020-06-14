package homework3.kryvenkosergii_lv444;

public class CheckNumber {

	private float numberF1;
	private float numberF2;
	private float numberF3;

	@SuppressWarnings("unused")
	private int numberI1 = 0;
	@SuppressWarnings("unused")
	private int numberI2 = 0;
	@SuppressWarnings("unused")
	private int numberI3 = 0;

	private int maxNumberI = 0;
	private int minNumberI = 0;

	public CheckNumber() {

	}

	public CheckNumber(float numberF1, float numberF2, float numberF3) {

		if (numberF1 <= 5 && numberF1 >= -5) {
			this.numberF1 = numberF1;
		}
//		else {
//			System.out.printf("Number %f isn't belong to the range [-5,5]\n", numberF1);
//		}
		if (numberF2 <= 5 && numberF2 >= -5) {
			this.numberF2 = numberF2;
		}
//		else {
//			System.out.printf("Number %f isn't belong to the range [-5,5]\n", numberF2);
//		}
		if (numberF3 <= 5 && numberF3 >= -5) {
			this.numberF3 = numberF3;
		}
//		else {
//			System.out.printf("Number %f isn't belong to the range [-5,5]\n", numberF3);
//		}
	}

	public float getNumberF1() {
		return numberF1;
	}

	public float getNumberF2() {
		return numberF2;
	}

	public float getNumberF3() {
		return numberF3;
	}

	public CheckNumber(int numberI1, int numberI2, int numberI3) {
		final int[] num = new int[3];
		this.numberI1 = num[0] = numberI1;
		this.minNumberI = numberI1;
		this.numberI2 = num[1] = numberI2;
		this.numberI3 = num[2] = numberI3;

		for (int i = 0; i < 3; i++) {
			if (num[i] > this.maxNumberI) {
				this.maxNumberI = num[i];
			}

			if (num[i] < this.minNumberI) {
				this.minNumberI = num[i];
			}
		}
	}

	public int getMaxNumberI() {
		return maxNumberI;
	}

	public int getMinNumberI() {
		return minNumberI;
	}

}
