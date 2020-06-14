package homework7.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence that contains the words between more than one space");
		String text = br.readLine();
//		String text = "I        am          learning     Java      Core    "; // test sentence

		// example #1
		StringBuilder sb = new StringBuilder();
		Pattern pat = Pattern.compile("[^ ]+");
		Matcher m = pat.matcher(text);
		while (m.find()) {
			sb.append(m.group(0)).append(" ");
		}
		System.out.println(sb);

		//// example #2
		System.out.println(text.replaceAll(" +", " "));
	}

}
