package classwork4.kryvenkosergii_lv44;

public class CheckMostExpensive {

	private int price1;
	private int price2;
	private int price3;
	private int price4;

	public int check1() {
		int num = 0;
		if (price1 > price2 && price1 > price3 && price1 > price4) {
			return num = 1;
		} else if (price2 > price1 && price2 > price3 && price2 > price4) {
			return num = 2;
		} else if (price3 > price1 && price3 > price2 && price3 > price4) {
			return num = 3;
		} else if (price4 > price1 && price4 > price2 && price4 > price3) {
			return num = 4;
		}
		return num;
	}

	public CheckMostExpensive(int price1, int price2, int price3, int price4) {
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
	}

}
