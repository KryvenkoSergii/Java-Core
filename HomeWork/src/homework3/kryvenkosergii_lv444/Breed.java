package homework3.kryvenkosergii_lv444;

public enum Breed {
	Boxer("Boxer"), Collie("Collie"), Dalmatian("Dalmatian"), GermanShepherdDog("German Shepherd Dog"),
	Mastiff("Mastiff"), Rottweiler("Rottweiler");

	private String breed;

	Breed(String nameBreed) {
		this.breed = nameBreed;
	}

	public String getNameBreed() {
		return breed;
	}

}
