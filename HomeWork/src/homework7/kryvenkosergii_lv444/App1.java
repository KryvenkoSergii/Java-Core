package homework7.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {

	public static void main(String[] args) throws IOException {
		// Enter in the console sentence of five words.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter in the console sentence of five words");
		String text = br.readLine();
//		String text = "Aksdfk cpokeopk adf323df32455 ijfoijsd sdfsd324"; // test sentence

		String[] arr = text.split(" ");
		String tmp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > tmp.length()) {
				tmp = arr[i];
			}
		}

		// -display the longest word in the sentence
		// -determine the number of its letters
		// -bring the second word in reverse order
		System.out.printf("longest word in the sentence is '%s' and it consists of %d letters\n", tmp, tmp.length());
		System.out.println("second word in reverse order: " + (new StringBuilder(arr[1]).reverse()));

	}

}
