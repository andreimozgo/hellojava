package Task2;
import java.util.Scanner; 
public class AdditionalPoint3 {

	public static void main(String[] args) {

		int number=0;
		int factorial=1;//единица, т.к. факториал 0=1
		Scanner input = new Scanner(System.in);//создаем объект класса Scanner для ввода с клавиатуры

		System.out.println("Введите натуральное число:");
		number=input.nextInt();//вводим число

		for (int i=1;i<number+1;i++){
			factorial*=i;//считаем факториал
		}
		//если было введено отрицательное число - сообщаем об ошибке
		if (number>=0)
			System.out.println("Факториал этого числа="+factorial);
		else
			System.out.println("Вы ввели неверное число.");	

	}

}
