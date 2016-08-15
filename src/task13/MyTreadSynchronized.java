package task13;

//Усовершенствовать предыдущее приложение, обеспечив синхронизацию, 
//чтобы потоки выводили строки по очереди.
import java.util.Scanner;

//new class extended from Thread
public class MyTreadSynchronized extends Thread {

	static int i = 1;
	static final Object monitor = new Object();

	// override run
	public void run() {
		// synchronize block by the object monitor
		synchronized (monitor) {
			for (int j = 1; j < 6; j++) {
				monitor.notify();
				System.out.println(getName() + ":" + " " + i++ + " " + i++
						+ " " + i++ + " " + i++ + " " + i++ + " " + i++ + " "
						+ i++ + " " + i++ + " " + i++ + " " + i++);
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// create new threads
		MyTreadSynchronized myThreadFirst = new MyTreadSynchronized();
		MyTreadSynchronized myThreadSecond = new MyTreadSynchronized();
		Scanner input = new Scanner(System.in);

		// set new names to the threads
		myThreadFirst.setName("Thread 1");
		myThreadSecond.setName("Thread 2");
		System.out.println("Введите start для запуска: ");
		while (true) {
			try {
				if (input.nextLine().equals("start")) {
					// start new threads
					myThreadFirst.start();
					myThreadSecond.start();
					break;
				} else {
					System.out
							.println("Вы ввели неверную команду. Повторите ввод: ");
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Вы ввели недопустимые символы.");
			}
			try {
				// main thread will wait others
				myThreadFirst.join();
				myThreadSecond.join();
			} catch (InterruptedException e) {
				System.out.println(" Глaвный поток прерван ");
			}
			input.close();
		}
	}
}
