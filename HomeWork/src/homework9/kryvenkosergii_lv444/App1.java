package homework9.kryvenkosergii_lv444;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("message from MyThread1: " + i);
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("message from MyThread2: " + i);
		}
	}
}

class MyThread3 extends Thread {
	public void run() {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("message from MyThread3: " + i);
		}
	}
}

public class App1 {

	public static void main(String[] args) {
		Thread t = new MyThread3();
		t.start();

	}

}
