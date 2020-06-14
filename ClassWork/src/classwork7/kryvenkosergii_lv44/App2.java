package classwork7.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App2 {

	public static void main(String[] args) throws IOException {
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

		// Add to employeeMap seven pairs (ID, name) of some persons.
		employeeMap.put(456, "Vasya");
		employeeMap.put(875, "Petya");
		employeeMap.put(175, "Vova");

		System.out.println(employeeMap);

		// Ask user to enter ID, then find and write corresponding name from your map.
		// If you can't find this ID - say about it to user (use function containsKey())
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ID");
		String text = br.readLine();
		int id = Integer.parseInt(text);
		if (employeeMap.containsKey(id)) {
			String value = (String) employeeMap.get(id);
			System.out.println("User name " + value);
		}

		// Ask user to enter name, verify than you have name in your map and write
		// corresponding ID. If you can't find this name - say about it to user (use
		// function containsValue())
		System.out.println("Enter name");
		String text2 = br.readLine();
		if (employeeMap.containsValue(text2)) {
			for(Map.Entry<Integer, String> e :employeeMap.entrySet()) {
				if (text2.equals(e.getValue())) {
					System.out.println(e.getKey());
				}
			}
		}
		
		
		for (Map.Entry<Integer, String> e :employeeMap.entrySet()) {
			int key = e.getKey();
			String value = e.getValue();
			System.out.println(key + ": " + value);
		}
		
		br.close();

	}

}
