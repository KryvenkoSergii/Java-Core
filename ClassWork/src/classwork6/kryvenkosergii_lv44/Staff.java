package classwork6.kryvenkosergii_lv44;

public abstract class Staff extends Person {

	public Staff(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	final static String TYPE_PERSON = "Staff";

	@Override
	public void Print() {
		System.out.println("I'm " + TYPE_PERSON + " and my name is " + getName());

	}

	abstract void Salary();

	public String getTypePerson() {
		return TYPE_PERSON;
	}

}
