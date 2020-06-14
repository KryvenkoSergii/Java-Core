package classwork6.kryvenkosergii_lv44;

public class App1 {

	public static void main(String[] args) {
		Animal [] cat = {new Cat(), new Cat(), new Dog(), new Dog()};
		
		for (int i = 0; i < cat.length; i++) {
			
			cat[i].feed();
			cat[1].voice();
			
		}
		
	}

}
