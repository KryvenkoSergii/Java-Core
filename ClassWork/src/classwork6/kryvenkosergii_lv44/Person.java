package classwork6.kryvenkosergii_lv44;

public abstract class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public abstract void Print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
