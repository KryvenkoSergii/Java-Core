package homework5.kryvenkosergii_lv444;

public class App1 {

	public static void main(String[] args) {
		Bird[] bird = new Bird[6];
		bird[0] = new Eagle(2, 100);
		bird[1] = new Swallow(1, 50);
		bird[2] = new Penguin(20, 5);
		bird[3] = new Chicken(2, 1);
		bird[4] = new Eagle(3, 150);
		bird[5] = new Penguin(30, 10);
		
		for (int i = 0; i < bird.length; i++) {
			bird[i].Fly();
		}
	}

}
