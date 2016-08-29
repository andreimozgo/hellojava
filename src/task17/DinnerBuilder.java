package task17;

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
