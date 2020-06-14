package classwork6.kryvenkosergii_lv44;

public class Dog implements Animal {

	@Override
	public String voice() {
		System.out.println("Dog voice");
		return "Dog voice";
	}

	@Override
	public String feed() {
		System.out.println("Dog feed");
		return "Dog feed";
	}

}
