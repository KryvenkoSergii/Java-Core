package classwork6.kryvenkosergii_lv44;

public class Teacher extends Staff {
	final static String TYPE_PERSON = "Teacher";

	@Override
	void Salary() {
		System.out.println("Salary 100");

	}

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void Print() {
		System.out.println("I'm " + TYPE_PERSON + " and my name is " + getName());

	}

}
