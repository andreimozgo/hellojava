package task17;

import java.util.ArrayList;

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
