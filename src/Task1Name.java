import java.util.Scanner;
public class Task1Name {

	public static void main(String[] args) {
		Scanner textInput = new Scanner(System.in);
		System.out.println("Введите Ваше имя:");
		String name = textInput.nextLine(); //Вводим текст с клавиатуры
		System.out.println("Привет, "+ name +'!');
	}

}
