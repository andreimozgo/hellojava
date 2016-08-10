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
//Собственно сам обед, состоящий из некоторых блюд
class Dinner {
	private ArrayList<String> dinner = new ArrayList<>();

	public void add(String dish) {
		dinner.add(dish);
	}

	public String toString() {
		return "Ваш обед: " + dinner.toString();
	}
}
//Абстрактный билдер
abstract class DinnerBuilder {
	protected Dinner dinner;

	public Dinner getDinner() {
		return dinner;
	}

	public void createNewDinner() {
		dinner = new Dinner();
	}

	public abstract void buildDinner();
}
//Билдер для первого стандартного типа комплексного обеда
class StandartDinnerFirst extends DinnerBuilder {
	public void buildDinner() {
		dinner.add("Борщ");
		dinner.add("Макароны с сосиской");
		dinner.add("Компот");
	}
}
//Билдер для второго стандартного типа комплексного обеда
class StandartDinnerSecond extends DinnerBuilder {
	public void buildDinner() {
		dinner.add("Солянка");
		dinner.add("Пюре с жаренной колбасой");
		dinner.add("Чай");
	}
}
//Класс директор создающий билдеры обедов и сами обеды
class Director {
	private DinnerBuilder dinnerBuilder;

	public void setDinnerBuilder(DinnerBuilder db) {
		dinnerBuilder = db;
	}

	public Dinner getDinner() {
		return dinnerBuilder.getDinner();
	}

	public void constructDinner() {
		dinnerBuilder.createNewDinner();
		dinnerBuilder.buildDinner();
	}
}
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