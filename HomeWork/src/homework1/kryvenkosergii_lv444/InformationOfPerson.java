package homework1.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InformationOfPerson {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your name? \n");
		String name = br.readLine();
		System.out.format("\nWhere are you live, %s? \n", name);
		String adress = br.readLine();

		System.out.format("Your's whole information is: %s , %s", name, adress);
	}

}
