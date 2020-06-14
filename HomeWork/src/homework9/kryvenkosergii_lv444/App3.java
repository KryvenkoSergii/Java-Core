package homework9.kryvenkosergii_lv444;

class One extends Thread {
	public void run() {
		Thread t = new Two();
		t.start();
	}
}

class Two extends Thread {
	public void run() {
		Thread t = new Three();
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		t.start();
	}
}

class Three extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}
	}
}

public class App3 {

	public static void main(String[] args) {
		Thread t = new One();
		t.start();
	}

}
