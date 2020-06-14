package homework5.kryvenkosergii_lv444;

public class NonFlyingBird extends Bird {

	private int weight;
	private int legLength;

	@Override
	public void Fly() {
		System.out.println("This bird can't fly");

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLegLength() {
		return legLength;
	}

	public void setLegLength(int legLength) {
		this.legLength = legLength;
	}

}
