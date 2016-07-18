package Task2;

public class Task2Point5 {

	public static void main(String[] args) {
		double weight = 82; //вес пользователя
		double height = 181; //рост пользователя
		//выводим оптимальный вес по формуле
		System.out.println("Оптимальный вес = "+ (height-100)+"кг");
		//сравниваем вес пользователя с оптимальным и воводим рекомендацию
		if (weight>height-100)
			System.out.println("Необходимо похудеть.");
		if (weight==height-100)
			System.out.println("Продолжайте в том же духе.");
		if (weight<height-100)
			System.out.println("Необходимо набрать вес.");
	}
}
