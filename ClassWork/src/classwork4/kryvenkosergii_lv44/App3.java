package classwork4.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of the country");
		String text = br.readLine();
		
		switch (text) {
		case "America":
			System.out.println(Continents.NorthAmerica);
			break;
			
		case "Mexica":
			System.out.println(Continents.NorthAmerica);
			break;
			
		case "Peru":
			System.out.println(Continents.SouthAmerica);
			break;
			
		case "Argentina":
			System.out.println(Continents.SouthAmerica);
			break;
			
		case "Egypt":
			System.out.println(Continents.Africa);
			break;
			
		case "UAR":
			System.out.println(Continents.Africa);
			break;
			
		case "UAE":
			System.out.println(Continents.Africa);
			break;
			
		case "Germany":
			System.out.println(Continents.Evrazia);
			break;
			
		case "France":
			System.out.println(Continents.Evrazia);
			break;
			
		case "Italy":
			System.out.println(Continents.Evrazia);
			break;
			
		case "Australia":
			System.out.println(Continents.Australia);
			break;
			
		}

	}

}
