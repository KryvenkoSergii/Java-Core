package homework5.kryvenkosergii_lv444;

public class FlyingBird extends Bird {

	private int sizeOfWings;
	private int heightOfFlying;

	@Override
	public void Fly() {
		System.out.println("This bird can fly");

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
