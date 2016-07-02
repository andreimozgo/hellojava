import java.util.Scanner;
public class Task1Name {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Введите имя:");
		String n = name.nextLine();
		System.out.println("Привет, "+ n +'!');
	}

}
