package Task2;
import java.util.Scanner; 
public class AdditionalPoint2 {
	public static void main (String args[]){

		int n=0;
		double sum=0;
		Scanner input = new Scanner(System.in);//создаем объект класса Scanner для ввода текста

		System.out.println("Введите n:");
		n=input.nextInt();//вводим число n

		if (n>0)//если n>0 запускаем цикл суммирования
			for (int i=1;i<n+1;i++){
				//необходим вещественный результат от деления, поэтому одно
				//из чисел не целое (1.0)
				sum+=1.0/i; 
			}	
		System.out.println(sum);//выводим сумму
	}



}
