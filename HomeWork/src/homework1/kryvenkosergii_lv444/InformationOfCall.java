package homework1.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InformationOfCall {

	public static void main(String[] args) throws IOException {
		int quantityOfCountries = 3;
		float[] c = new float[quantityOfCountries];
		float[] t = new float[quantityOfCountries];

		for (int i = 0; i < quantityOfCountries; i++) {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("Enter cost units per minute for %s country \n", i + 1);
			String text1 = br1.readLine();
			c[i] = Float.parseFloat(text1);

			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("Enter continued talks of the %s call \n", i + 1);
			String text2 = br2.readLine();
			t[i] = Float.parseFloat(text2);

		}

		for (int i = 0; i < quantityOfCountries; i++) {
			System.out.println("For the " + (i + 1) + " country, cost units per minute " + c[i]
					+ " and continued talks " + t[i] + ", cost your call is: " + c[i] * t[i] + "\n");
		}

	}

}
