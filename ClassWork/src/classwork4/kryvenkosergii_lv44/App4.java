package classwork4.kryvenkosergii_lv44;

public class App4 {

	public static void main(String[] args) {
		Product p1 = new Product("apple", 3, 10);
		Product p2 = new Product("orange", 15, 3);
		Product p3 = new Product("onion", 2, 6);
		Product p4 = new Product("carrot", 5, 8);

		//Checking the most expensive item
		CheckMostExpensive a1 = new CheckMostExpensive (p1.getPrice(), p2.getPrice(), p3.getPrice(), p4.getPrice());
		switch (a1.check1()) {
		case 1:
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", p1.getName(), p1.getQuantitu());
			break;
		case 2:
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", p2.getName(), p2.getQuantitu());
			break;
		case 3:
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", p3.getName(), p3.getQuantitu());
			break;
		default:
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", p4.getName(), p4.getQuantitu());
			break;
		}
		
		//Checking the items, which has the biggest quantity
		CheckBiggestQuantity a2 = new CheckBiggestQuantity(p1.getQuantitu(), p2.getQuantitu(), p3.getQuantitu(), p4.getQuantitu());
		switch (a2.check2()) {
		case 1:
			System.out.printf("The item which has the biggest quantity it's the %s\n", p1.getName());
			break;
		case 2:
			System.out.printf("The item which has the biggest quantity it's the %s\n", p2.getName());
			break;
		case 3:
			System.out.printf("The item which has the biggest quantity it's the %s\n", p3.getName());
			break;
		default:
			System.out.printf("The item which has the biggest quantity it's the %s\n", p4.getName());
			break;
		}

	}

}
