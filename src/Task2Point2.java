import java.util.Scanner; //импортируем класс Scanner

public class Task2Point2 {

	public static void main(String[] args) {
		
	int number1, number2; //две переменные, которые будем вводить с клавиатуры
	Scanner input = new Scanner(System.in); //создаем объект класса сканер
	
	System.out.print("Введите первое число: ");
	number1=input.nextInt(); //вводим первое число
	System.out.print("Введите второе число: ");
	number2=input.nextInt(); //вводим второе число
	//сравниваем числа и выводим результат сравнения
	if (number1>number2)
		System.out.println("Первое число больше.");
	if (number1<number2) 
		System.out.println("Второе число больше.");
	if (number1==number2)
		System.out.println("Числа равны");		
	}

}
