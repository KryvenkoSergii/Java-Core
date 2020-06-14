package classwork13.kryvenkosergii_lv44;

public class Task5 {

	public static boolean checkPalindrom (String st) {
		StringBuilder sb = new StringBuilder(st);
		if (st.equals(sb.reverse().toString())) {
			System.out.println("text is polindrom");
			return true;
		} else {
			System.out.println("text isn't polindrom");
			return false;
		}
	}
}
