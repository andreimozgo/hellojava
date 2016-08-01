package task13;
//Усовершенствовать предыдущее приложение, обеспечив синхронизацию, 
//чтобы потоки выводили строки по очереди..
//Синхронизация, однако, не гарантирует очередность вывода строк :(
import java.util.Scanner;
//new class extended from Thread
public class MyTreadSynchronized extends Thread {
	static Integer i;
	//override run
	public void run() {
		while(i<81){
			//synchronize block by the object Integer i
			synchronized(i) {
				i+=10;}
			System.out.println(getName() + ":" + " " + (i+1) + " " + 
					(i + 2) + " " + (i+3) + " " + (i+4) + " " + (i+5) + " " + 
					(i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9) + 
					" " + (i+10));
			yield();//without yield situation is very similar to previous task
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyTreadSynchronized myThreadFirst = new MyTreadSynchronized();
		MyTreadSynchronized myThreadSecond = new MyTreadSynchronized();
		Scanner input = new Scanner(System.in);

		myThreadFirst.setName("Thread 1");
		myThreadSecond.setName("Thread 2");		
		System.out.println("Введите start для запуска: ");
		while(true){
			try{
				if(input.nextLine().equals("start")){
					i = -10;
					myThreadFirst.start();
					myThreadSecond.start();
					break;
				}
				else{
					System.out.println("Вы ввели неверную команду. Повторите ввод: ");
				}
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("Вы ввели недопустимые символы.");
			}
			try{
				myThreadFirst.join();
				myThreadSecond.join();
			}
			catch (InterruptedException e){
				System.out.println ( " Глaвный поток прерван " ); 
			}
			input.close();
		}
	}
}
