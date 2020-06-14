package classwork10.kryvenkosergii_lv44;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1000);
				System.out.println("I study Java ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class App1 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new MyThread();
		t1.start();
	}

}
