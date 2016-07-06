package Task3;
import java.util.Scanner;

public class Point3 {
	//ќбъ€вл€ем объект класса Scanner дл€ ввода данных и 
	//объ€вл€ем и инициализируем три массива.
	public static void main(String[] args) {
		int [] myArray1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] myArray2 = new int [15];
		int [] myArray3 = new int [15];
		Scanner input = new Scanner(System.in);
		//«начени€ второго массива ввод€тс€ с клавиатуры
		System.out.println("¬ведите 15 элементов массива є2:");
		for (int i=0;i<15;i++){
			myArray2[i]=input.nextInt();
		}
		//«начени€ третьего массива ввод€тс€ случайным образом от 1 до 99
		for (int i=0;i<15;i++){
			myArray3[i]=(int)(Math.random()*100);
		}

	}

}
