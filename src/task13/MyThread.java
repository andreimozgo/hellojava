package task13;
//Написать приложение, в котором используются 2 потока
//На моем компе чаще всего 1й поток берет на себя все, но иногда вмешивается и второй 
import java.util.Scanner;

//new class extended from Thread
public class MyThread extends Thread {

	static int i; //static to use its value with all threads

	//override run
	public void run() {
		while(i<81){
			i+=10;	
			System.out.println(getName() + ":" + " " + (i+1) + " " + (i + 2) + 
					" " + (i+3) + " " + (i+4) + " " + (i+5) + " " + (i+6) + 
					" " + (i+7) + " " + (i+8) + " " + (i+9) + " " + (i+10));
		}
	}

	public static void main(String[] args){
		//create new threads
		MyThread myThreadFirst = new MyThread();
		MyThread myThreadSecond = new MyThread();
		Scanner input = new Scanner(System.in);
		//set new names to the threads
		myThreadFirst.setName("Thread 1");
		myThreadSecond.setName("Thread 2");		
		System.out.println("Введите start для запуска: ");
		while(true){
			try{
				if(input.nextLine().equals("start")){
					i = -10;
					//start new threads
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
				//main thread will wait others
				myThreadFirst.join();
				myThreadSecond.join();
			}
			catch (InterruptedException e){
				System.out.println ( " Глaвный поток прерван " ); 
			}
			//close scanner
			input.close();
		}
	}
}
