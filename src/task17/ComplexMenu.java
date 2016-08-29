package task17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Паттерн Builder. Разработать модель системы Комплексный обед. Написать код
 * приложения, позволяющий создавать как стандартные комплексные обеды, так и
 * обеды, в которые включены дополнительные блюда из меню. Минимум 3 типа
 * дополнительных блюд.
 * 
 * @author Андрей
 * 
 */
//Главный класс, где все происходит
public class ComplexMenu {
	public static void main(String[] args) {
		Director director = new Director();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Выберите комплексный обед:");
		System.out.println("1 - Борщ, макароны с сосиской, компот");
		System.out.println("2 - Солянка, пюре с жаренной колбасой, чай");
		//выбираем комплексный обед из стандартных
		switch (scanner.nextInt()) {
		case 1:
			DinnerBuilder standartDinnerFirst = new StandartDinnerFirst();
			director.setDinnerBuilder(standartDinnerFirst);
			break;
		case 2:
			DinnerBuilder standartDinnerSecond = new StandartDinnerSecond();
			director.setDinnerBuilder(standartDinnerSecond);
			break;
		}
		//Создаем объект Dinner с нужными свойствами
		director.constructDinner();
		Dinner dinner = director.getDinner();
		//При желании добавляем одно из трех блюд
		System.out.println("Вы можете добавить дополнительное блюдо:");
		System.out
				.println("1 - Греческий салат\n2 - Круассан\n3 - Пицца\n0 - Дополнительное блюдо не требуется");
		switch (scanner.nextInt()) {
		case 1:
			dinner.add("Греческий салат");
			break;
		case 2:
			dinner.add("Круассан");
			break;
		case 3:
			dinner.add("Пицца");
			break;
		case 0:
			break;
		}
		System.out.println(dinner);
		scanner.close();
	}
}