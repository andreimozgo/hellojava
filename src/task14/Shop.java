package task14;

/**Class models a shop with fixed number of cash desks.
 * Every customer is a separate thread.
 * Name of goods will appear when customer is on the cash desk.
 * 
 */

import java.util.concurrent.*;
//Class Customer with his products
class Customer implements Runnable {
	String name;
	CountDownLatch latch;
	String[] products;

	Customer(CountDownLatch с, String n, String[] p) {
		latch = с;
		name = n;
		products = p;
		new Thread(this);
	}
	//method writes product  names
	public void run() {
		for (int i = 0; i < products.length; i++) {
			System.out.println(name + "· " + products[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();
		}
	}
}

public class Shop {

	public static void main(String[] args) throws InterruptedException {
		//Arrays of goods for every customer
		String[] products1 = { "product1", "product2", "product3", "product4",
				"product5" };
		String[] products2 = { "product1" };
		String[] products3 = { "product1", "product2", "product3", "product4",
				"product5" };
		String[] products4 = { "product1", "product2", "product3", "product4" };
		//CountDownLatches for every customer. Every CountDownLatch starts with 
		//value = number of goods at the customer basket. 
		CountDownLatch cdl = new CountDownLatch(products1.length);
		CountDownLatch cdl2 = new CountDownLatch(products2.length);
		CountDownLatch cdlЗ = new CountDownLatch(products3.length);
		CountDownLatch cdl4 = new CountDownLatch(products4.length);
		//Here we can set number of cash desks
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//GAME is starting!
		System.out.println("Hungry customers entered to the store...");
		for (int i = 1; i < 7; i++) {
			System.out.print('.');
			Thread.sleep(500);
		}
		System.out.println("...they have reached the cash desks!!!");
		Thread.sleep(1500);
		//Threads starts
		es.execute(new Customer(cdl, "Customer 1", products1));
		es.execute(new Customer(cdl2, "Customer 2", products2));
		es.execute(new Customer(cdlЗ, "Customer 3", products3));
		es.execute(new Customer(cdl4, "Customer 4", products4));
		//Countdown starts for every thread
		try {
			cdl.await();
			cdl2.await();
			cdlЗ.await();
			cdl4.await();
		} catch (InterruptedException ехс) {
			System.out.println(ехс);
		}
		//Threads shutdown after they complete
		es.shutdown();
		System.out
				.println("All customers have left the shop! We are alive, captain!!!");
		System.out.println("Format C: complete");
	}
}