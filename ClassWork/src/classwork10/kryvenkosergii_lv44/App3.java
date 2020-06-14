package classwork10.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class App3 {

	public static void main(String[] args) throws IOException {
//		String file = "mytext.txt";
		File textFile = new File("mytext.txt");
		Pattern isDigits = Pattern.compile("\\s*\\d+\\s*");
		List<Long> arrayList = new ArrayList<Long>();
		BufferedReader br = new BufferedReader(new FileReader(textFile));
		String st;
		String shortest=br.readLine();
		String longest = shortest;
		br.close();
		br = new BufferedReader(new FileReader(textFile));
//		br.lines();
		List<String> list = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			if (isDigits.matcher(st).matches()) {
				try {
					long p = Long.parseLong(st.trim());
					arrayList.add(p);
//					System.out.println("Number: " + p);
				} catch (NumberFormatException nfe) {
//					System.out.println("Text*: " + st);
				}
			} else {
//				System.out.println("Text: " + st);
			}
			if (st.length() > longest.length()) {
				longest = st;
			}
			if (shortest.length()> st.length()) {
				shortest = st;
			}
			if (st.contains("var")) {
				list.add(st);
			}
		}
		br.close();

		long sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i);
		}
		System.out.println("Quantity numer is " + arrayList.size() + " and their sum is " + sum);
		System.out.println("Longest line is " + longest);
		System.out.println("Shortest line is " + shortest);
		
		for (String string : list) {
			System.out.println(string);
		}

	}

}
