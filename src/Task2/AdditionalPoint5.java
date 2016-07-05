package Task2;
import java.util.Scanner;
public class AdditionalPoint5 {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Введите число n:");
		n=input.nextInt();
		if (n>0) {
			for (int i=1;i<=n;i++){
				sum+=i;
			}
			System.out.println("Сумма чисел от 1 до n = "+sum);
		}
		else {
			System.out.println("Вы ввели неверное число");
		}
	}

}
