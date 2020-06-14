package homework6.kryvenkosergii_lv444;

import java.util.HashMap;
import java.util.Map;

public class App2 {

	public static void main(String[] args) {
		// Create map personMap and add to it ten persons
		Map<String, String> personMap = new HashMap<String, String>();

		personMap.put("Vasya", "one");		//1
		personMap.put("Orest", "two");		//2
		personMap.put("Vasya", "three");	//3
		personMap.put("Petya", "four");		//4
		personMap.put("Taras", "five");		//5
		personMap.put("Igor", "six");		//6
		personMap.put("Vasya", "seven");	//7
		personMap.put("Yriy", "eight");		//8
		personMap.put("Vasya", "nine");		//9
		personMap.put("Petya", "ten");		//10

		// Output the entities of the map on the screen.
		for (Map.Entry<String, String> e : personMap.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " " + value); // There aren't two persons with the same firstName
		}
		
		System.out.println();
		
		//Remove from the map person whose firstName is ”Orest”
		personMap.remove("Orest");
		System.out.println(personMap);
		
	}

}
