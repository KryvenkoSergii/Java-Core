package homework9.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;

public class App4 {

	public static void main(String[] args) throws IOException {
		String file1 = "file1.txt";
		String file2 = "file2.txt";
		File textFile1 = new File(file1);
		BufferedReader br = new BufferedReader(new FileReader(textFile1));
		String st;
		String longest = br.readLine();
		br.close();
		int count = 0; // number of lines
		String name = null;
		int birthday = 0;
		br = new BufferedReader(new FileReader(textFile1));
		while ((st = br.readLine()) != null) {
//			System.out.println(st);
			if (st.length() > longest.length()) {
				longest = st;
			}
			if (st.toLowerCase().contains("name")) {
				name = st;
			}
			if (st.toLowerCase().contains("birthday")) {
				String[] arr = st.split("[ \t\r\n]+");
				Pattern birthdayYear = Pattern.compile("\\d+");
				for (String string : arr) {
					if (birthdayYear.matcher(string).matches()) {
						birthday = Integer.parseInt(string);
					}
				}
			}
			count++;
		}
		br.close();

		File textFile2 = new File(file2);
		BufferedWriter br2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(textFile2)));

		System.out.println("number of lines in file1.txt " + count);
		System.out.println("the longest line in file1.txt " + longest);
		System.out.println(name);
		System.out.println("birthday date " + birthday);

		br2.write("number of lines in file1.txt: " + count + "\n");
		br2.write("the longest line in file1.txt: " + longest + "\n");
		br2.write(name + "\n");
		br2.write("birthday date: " + birthday + "\n");
		br2.close();

	}

}
