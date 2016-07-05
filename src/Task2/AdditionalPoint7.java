package Task2;
import java.util.Scanner;
public class AdditionalPoint7 {

	public static void main(String[] args) {

		String str="";
		double number1 = 1;//первое число
		double number2 = 1;//второе число
		double result; //результат операции
		Scanner input1 = new Scanner(System.in);//объект класса Scanner для считывания первого числа
		Scanner input2 = new Scanner(System.in);//объект класса Scanner для считывания второго числа
		Scanner input3 = new Scanner(System.in);//объект класса Scanner для считывания операции

		while (!str.equals("q")){
			System.out.print("Введите первое число:");
			number1=input1.nextDouble();
			System.out.print("Введите второе число:");
			number2=input2.nextDouble();
			System.out.print("Выберите операцию (+ или /):");
			str=input3.nextLine();

			if (str.equals("+")){
				result=number1+number2;
				System.out.println("Результат операции:"+result);
			}
			if (str.equals("/")){
				result=number1/number2;
				System.out.println("Результат операции:"+result);
			}
			System.out.print("Введите q для выхода или ввод для продолжения.");
			str=input3.nextLine();
		}
		input1.close();
		input2.close();
		input3.close();
	}

}
