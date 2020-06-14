package homework4.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {

	public static void main(String[] args) throws IOException {
		int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of month");
		String text = br.readLine();
		int numOfMonth = Integer.parseInt(text);
		System.out.println("This month has " + month[numOfMonth-1] + " days");

	}

}
