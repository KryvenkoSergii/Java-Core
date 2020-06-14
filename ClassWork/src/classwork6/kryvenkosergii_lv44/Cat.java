package classwork6.kryvenkosergii_lv44;

public class Cat implements Animal {
	
	private String name;
	

	public String getName() {
		return name;
	}
	
	

	public Cat() {
		
	}



	public Cat(String name) {
		
		this.name = name;
	}


	@Override
	public String voice() {
		System.out.println("Cat voice");
		return "Cat voice";
	}

	@Override
	public String feed() {
		System.out.println("Cat feed");
		return "Cat feed";
	}

}
