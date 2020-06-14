package homework7.kryvenkosergii_lv444;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App3 {

	public static void main(String[] args) {
		String text = "A quick $22.15 brown $ fox $1.00 jump $123 over $123456.67 the lazy $.12 dog";
		// Implement a pattern for US currency: the first symbol "$", then any number of
		// digits, dot and two digits after the dot
		// Enter the text from the console that contains several occurrences of US
		// currency.
		Pattern p = Pattern.compile("\\$(\\d*\\.\\d{2}|\\d+)");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(m.group(0));
		}
	}

}
