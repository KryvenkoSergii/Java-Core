package classwork4.kryvenkosergii_lv44;

public class CheckBiggestQuantity {

	private int quantitu1;
	private int quantitu2;
	private int quantitu3;
	private int quantitu4;

	public CheckBiggestQuantity(int quantitu1, int quantitu2, int quantitu3, int quantitu4) {
		this.quantitu1 = quantitu1;
		this.quantitu2 = quantitu2;
		this.quantitu3 = quantitu3;
		this.quantitu4 = quantitu4;
	}

	public int check2() {
		int num = 0;
		if (quantitu1 > quantitu2 && quantitu1 > quantitu3 && quantitu1 > quantitu4) {
			return num = 1;
		} else if (quantitu2 > quantitu1 && quantitu2 > quantitu3 && quantitu2 > quantitu4) {
			return num = 2;
		} else if (quantitu3 > quantitu1 && quantitu3 > quantitu2 && quantitu3 > quantitu4) {
			return num = 3;
		} else if (quantitu4 > quantitu1 && quantitu4 > quantitu2 && quantitu4 > quantitu3) {
			return num = 4;
		}
		return num;
	}

}
