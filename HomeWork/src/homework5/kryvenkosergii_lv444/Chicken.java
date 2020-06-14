package homework5.kryvenkosergii_lv444;

public class Chicken extends NonFlyingBird {

	private int weight;
	private int legLength;

	@Override
	public void Fly() {
		System.out.println("This Chicken can't fly and its weight " + weight + " and leg length " + legLength);
	}

	public Chicken(int weight, int legLength) {
		this.weight = weight;
		this.legLength = legLength;
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
