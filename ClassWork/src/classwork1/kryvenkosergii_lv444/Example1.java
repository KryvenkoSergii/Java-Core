package classwork1.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {

	public static void main(String[] args) throws IOException {
//		System.out.println("abc");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write your text");
		String text = br.readLine();		
		System.out.println("Your text is " + text);
		
		System.out.println("Enter your number");
		String text2 = br.readLine();		
		int num = Integer.parseInt(text2);
		System.out.println("Your number is " + num);
		

	}

}
