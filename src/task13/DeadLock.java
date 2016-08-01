package task13;

public class DeadLock {
	
	public static Object monitor1 = new Object();
	public static Object monitor2 = new Object();

	public static void main(String args[]){

		FirstClass firstThread = new FirstClass();
		SecondClass secondThread = new SecondClass();
		firstThread.start();
		secondThread.start();
	}

	static class FirstClass extends Thread{
		public void run(){
			synchronized(monitor1) {
				System.out.println("Thread1 in monitor1");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized(monitor2) {
					System.out.println("Thread1 in monitor2");
				}
			}
		}
	}

	static class SecondClass extends Thread{ 
		public void run(){
			synchronized(monitor2) {
				System.out.println("Thread2 in monitor2");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized(monitor1) {
					System.out.println("Thread2 in monitor1");
				}
			}
		}
	}
}
