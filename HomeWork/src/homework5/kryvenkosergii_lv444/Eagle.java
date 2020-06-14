package homework5.kryvenkosergii_lv444;

public class Eagle extends FlyingBird {

	private int sizeOfWings;
	private int heightOfFlying;

	@Override
	public void Fly() {
		System.out.println("This Eagle can fly and its size of wings " + sizeOfWings + " and height of flying " + heightOfFlying);

	}

	public Eagle(int sizeOfWings, int heightOfFlying) {
		this.sizeOfWings = sizeOfWings;
		this.heightOfFlying = heightOfFlying;
	}

	public int getSizeOfWings() {
		return sizeOfWings;
	}

	public void setSizeOfWings(int sizeOfWings) {
		this.sizeOfWings = sizeOfWings;
	}

	public int getHeightOfFlying() {
		return heightOfFlying;
	}

	public void setHeightOfFlying(int heightOfFlying) {
		this.heightOfFlying = heightOfFlying;
	}

}
