package task17;

//Билдер для второго стандартного типа комплексного обеда
class StandartDinnerSecond extends DinnerBuilder {
	public void buildDinner() {
		dinner.add("Солянка");
		dinner.add("Пюре с жаренной колбасой");
		dinner.add("Чай");
	}
}
