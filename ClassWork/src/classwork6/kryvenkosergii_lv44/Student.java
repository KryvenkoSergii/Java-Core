package classwork6.kryvenkosergii_lv44;

public class Student extends Person {
	final static String TYPE_PERSON = "Student";

	@Override
	public void Print() {
		System.out.println("I'm " + TYPE_PERSON + " and my name is " + getName());

	}

	public Student(String name) {
		super(name);
	}

	public String getTypePerson() {
		return TYPE_PERSON;
	}

}
