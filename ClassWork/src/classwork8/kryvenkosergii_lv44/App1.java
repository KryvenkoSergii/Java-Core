package classwork8.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App1 {

	public static void main(String[] args) throws IOException {

		// 1. Enter the two variables of type String. Determine whether the first variable
		// substring second. For example, if you typed «IT» and «IT Academy» you must
		// receive true
		String a = "IT";
		String b = "IT Academy";

		System.out.println(a.startsWith("IT"));
		System.out.println(b.startsWith("IT"));
		System.out.println("");

		// 2. Enter surname, name and patronymic on the console as a variable of type
		// String. Output on the console:
		// 1)surnames and initials; 2)name; 3)name, middle name and last name
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter surname, name and patronymic");
		String text = br.readLine();
//		String text = "Ivanov Ivan Ivanovych";

		String[] arr = text.split(" ");
		String n = arr[1].substring(0, 1);
		String p = arr[2].substring(0, 1);
		System.out.println(arr[0] + " " + n + "." + p + ".");
		System.out.println(arr[1]);
//		for (String w : arr) {
//			System.out.print(w + " ");
//		}
		for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
			System.out.print(arr[j] + " ");			
		}
		System.out.println("\n");

		// 3. The user name can be 3 to 15 characters of the Latin alphabet, numbers, and
		// underscores. Using regular expressions implement checking the user name for
		// validity. Input five names in the main method . Output a message to the
		// console of the validation of each of the entered names.
		String[] x = { "Ivan", "Igor", "Volodumyr", "Taras", "Ses86@sdfds" };

		for (String name : x) {
			Pattern pat = Pattern.compile("[a-zA-Z]{3,15}");
			Matcher m = pat.matcher(name);
			System.out.println("The name is " + name + "; result validation: " + m.matches());
		}

	}

}
