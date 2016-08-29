package task17;

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
