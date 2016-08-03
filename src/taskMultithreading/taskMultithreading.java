package taskMultithreading;

import java.util.concurrent.Semaphore;

public class taskMultithreading {
	static int i = 0;
	static Semaphore semaforeProduser = new Semaphore(1);
	static Semaphore semaforeCustomer = new Semaphore(0);

	static class Producer extends Thread {

		public void run() {
			for (int j = 1; j < 5; j++) {
				try {
					semaforeProduser.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;
				System.out.println("Step " + j);
				System.out.println("Producer increased: i = " + i);
				semaforeCustomer.release();
			}
		}
	}

	static class Customer extends Thread {

		public void run() {
			for (int j = 1; j < 5; j++) {
				try {
					semaforeCustomer.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i--;
				System.out.println("Customer reduced: i = " + i);
				semaforeProduser.release();
			}
		}
	}

	public static void main(String[] args) {
		Producer producer = new Producer();
		Customer customer = new Customer();

		producer.start();
		customer.start();
	}
}
