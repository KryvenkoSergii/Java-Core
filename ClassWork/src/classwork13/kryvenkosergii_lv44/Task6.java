package classwork13.kryvenkosergii_lv44;

public class Task6 {
public static int countWords(String ss) {
	int count=0;
	if(ss.length()!=0) {
		count++;
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)	== ' ') {
				count++;
			}
		}
	}
	System.out.println("You enter "+count+" words");
	return count;
}
}
