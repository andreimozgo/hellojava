package Task3;
import java.util.Scanner;

public class Point3 {
	//Объявляем объект класса Scanner для ввода данных и 
	//объявляем и инициализируем три массива.
	public static void main(String[] args) {
		int [] myArray1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] myArray2 = new int [15];
		int [] myArray3 = new int [15];
		Scanner input = new Scanner(System.in);
		//Значения второго массива вводятся с клавиатуры
		System.out.println("Введите 15 элементов массива №2:");
		for (int i=0;i<15;i++){
			myArray2[i]=input.nextInt();
		}
		//Значения третьего массива вводятся случайным образом от 1 до 99
		for (int i=0;i<15;i++){
			myArray3[i]=(int)(Math.random()*100);
		}

	}

}
