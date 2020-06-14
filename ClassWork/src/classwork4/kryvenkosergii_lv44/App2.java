package classwork4.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of the day");
		String text1 = br.readLine();
		int num = Integer.parseInt(text1);
		
		switch (num) {
		case 1:
			System.out.println("Monday, Понеділок, Понедельник");
			break;
		case 2:
			System.out.println("Tuesday, Вівторок, Вторник");
			break;
		case 3:
			System.out.println("Wednesday, Середа, Среда");
			break;
		case 4:
			System.out.println("Thursday, Четвер, Четверг");
			break;
		case 5:
			System.out.println("Friday, Пятниця, Пятница");
			break;
		case 6:
			System.out.println("Saturday, Субота, Суббота");
			break;
		case 7:
			System.out.println("Sunday, Неділя, Воскресеньн");
			break;
		
		}

	}

}
