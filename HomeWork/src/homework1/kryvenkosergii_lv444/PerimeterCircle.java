package homework1.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimeterCircle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of Flower bed: ");
		String text = br.readLine();
		float radius = Float.parseFloat(text);
		System.out.format("Obtained results perimeters of Flower bed is: %04.3f \n", Math.PI * radius * 2);
		System.out.printf("Obtained results area of Flower bed is: %04.3f", Math.PI * radius * radius);

	}

}
