package classwork10.kryvenkosergii_lv44;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(500);
				System.out.println("Hello world");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
				System.out.println("Peace in the peace");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class App2 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is Serge");
	}

}
