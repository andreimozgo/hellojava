package Task2;
import java.util.Scanner; //импортируем класс Scanner
public class Task2Point7 {

	public static void main(String[] args) {
		//создаем объект класса Scanner для ввода данных
		Scanner input = new Scanner(System.in); 
		int day=0;

		System.out.println("Введите номер дня недели: ");
		day = input.nextInt(); //водим номер дня
		//если число больше 0 и меньше 8, то выводим соответствующий день недели		
		if (day>0&&day<8){ 
			switch (day) {
			case 1: System.out.println("Понедельник");
			break;
			case 2: System.out.println("Вторник");
			break;
			case 3: System.out.println("Среда");
			break;	
			case 4: System.out.println("Четверг");
			break;
			case 5: System.out.println("Пятница");
			break;
			case 6: System.out.println("Суббота");
			break;
			case 7: System.out.println("Воскресение");
			}
		}
		//если число не в нужном диапазоне выводим сообщение об ошибке
		else System.out.println("Вы ввели неверный номер.");
	}

}
