package task13;
//Написать приложение, в котором используются 2 потока
import java.util.Scanner;

public class MyThread extends Thread {
	//override run
	public void run() {
		System.out.println(getName() + ": 1 2 3 4 5 6 7 8 9 10");
		System.out.println(getName() + ": 11 12 13 14 15 16 17 18 19 20");
		System.out.println(getName() + ": 21 22 23 24 25 26 27 28 29 30");
		System.out.println(getName() + ": 31 32 33 34 35 36 37 38 39 30");
		System.out.println(getName() + ": 41 42 43 44 45 46 47 48 49 40");
		System.out.println(getName() + ": 51 52 53 54 55 56 57 58 59 60");
		System.out.println(getName() + ": 61 62 63 64 65 66 67 68 69 70");
		System.out.println(getName() + ": 71 72 73 74 75 76 77 78 79 80");
		System.out.println(getName() + ": 81 82 83 84 85 86 87 88 89 90");
		System.out.println(getName() + ": 91 92 93 94 95 96 97 98 99 100");
	}

	public static void main(String[] args) {
		MyThread myThreadFirst = new MyThread();
		MyThread myThreadSecond = new MyThread();
		Scanner input = new Scanner(System.in);

		myThreadFirst.setName("Thread 1");
		myThreadSecond.setName("Thread 2");		
		System.out.println("Введите start для запуска: ");
		while(true){
			try{
				if(input.nextLine().equals("start")){
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
		}
		input.close();
	}
}
