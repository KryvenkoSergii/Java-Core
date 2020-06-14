package classwork6.kryvenkosergii_lv44;

public class Cleaner extends Staff {
	final static String TYPE_PERSON = "Cleaner";

	@Override
	void Salary() {
		System.out.println("Salary 50");

	}

	public Cleaner(String name) {
		super(name);
	}

	@Override
	public void Print() {
		System.out.println("I'm " + TYPE_PERSON + " and my name is " + getName());

	}

	public String getTypePerson() {
		return TYPE_PERSON;
	}

}
