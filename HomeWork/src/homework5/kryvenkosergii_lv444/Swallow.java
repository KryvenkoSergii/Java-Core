package homework5.kryvenkosergii_lv444;

public class Swallow extends FlyingBird {

	private int sizeOfWings;
	private int heightOfFlying;

	@Override
	public void Fly() {
		System.out.println("This Swallow can fly and its size of wings " + sizeOfWings + " and height of flying "
				+ heightOfFlying);

	}

	public Swallow(int sizeOfWings, int heightOfFlying) {
	
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
