package task17;

import java.util.ArrayList;
import java.util.Scanner;

class Dinner {

	private ArrayList<String> dinner = new ArrayList<>();

	public void add(String dish) {
		dinner.add(dish);
	}

	public String toString() {

		return "Ваш обед: " + dinner.toString();
	}
}

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

class StandartDinnerFirst extends DinnerBuilder {
	public void buildDinner() {
		dinner.add("Борщ");
		dinner.add("Макароны с сосиской");
		dinner.add("Компот");
	}
}

class StandartDinnerSecond extends DinnerBuilder {
	public void buildDinner() {
		dinner.add("Солянка");
		dinner.add("Пюре с жаренной колбасой");
		dinner.add("Чай");
	}
}

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

public class ComplexMenu {
	public static void main(String[] args) {
		Director director = new Director();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Выберите комплексный обед:");
		System.out.println("1 - Борщ, макароны с сосиской, компот");
		System.out.println("2 - Солянка, пюре с жаренной колбасой, чай");
		switch(scanner.nextInt()){
		case 1:
			DinnerBuilder standartDinnerFirst = new StandartDinnerFirst();
			director.setDinnerBuilder(standartDinnerFirst);
			break;
		case 2:
			DinnerBuilder standartDinnerSecond = new StandartDinnerSecond();
			director.setDinnerBuilder(standartDinnerSecond);
			break;
		}
		director.constructDinner();
		Dinner dinner = director.getDinner();
		System.out.println("Вы можете добавить дополнительное блюдо:");
		System.out.println("1 - Греческий салат\n2 - Круассан\n3 - Пицца\n0 - Дополнительное блюдо не требуется");
		switch(scanner.nextInt()){
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