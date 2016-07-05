package Task2;
import java.util.Scanner; //импортируем класс Scanner для ввода текста
public class Task2Point6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //создаем объект класса Scsanner
		short sum = 0;
		
		for (int i = 1; i <= 10; i++){ //цикл из 10ти повторов для удобства проверки
			System.out.print("Введите число в рублях от 1 до 999: ");
			sum = input.nextShort();	//считываем введенное число		
//если последняя цифра числа 1, но это не 11, выводим "рубль"
			if ((sum%10==1)&&sum!=11)
				System.out.println("рубль");
			else {
//проверяем последнюю цифру чисел меньше 5 и больше 20. Если это 2 или 3 или 4, то 
//выводим "рубля"
				if (((sum>20)||(sum<5))&&((sum%10==2)||(sum%10==3)||(sum%10==4)))
					System.out.println("рубля");
				else 
//для всех остальных выводим: "рублей"
					System.out.println("рублей");
			}
		}	
	}
}
