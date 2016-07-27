package TaxiProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**It's a main class of my project!
 * @author Mozgo Andrei
 */

class MyComparator implements Comparator<Taxi> {

	@Override
	public int compare(Taxi arg0, Taxi arg1) {
		return Integer.compare(arg0.getConsumption(), arg1.getConsumption());
	}
}

public class Main {

	public static void main(String[] args) {
		int totalPrice = 0;
		int minSpeed = -1;
		int maxSpeed = -1;
		Scanner textInput = new Scanner(System.in);
		TaxiEconomy dacia = new TaxiEconomy("Dacia",10000,8,100);
		TaxiEconomy daewoo = new TaxiEconomy("Daewoo",8000,7,110);
		TaxiRegular toyota = new TaxiRegular("Toyota",20000,10,130);		
		TaxiRegular honda = new TaxiRegular("Honda",21000,11,135);	
		TaxiVip mercedes = new TaxiVip("Mercedes",30000,12,150);			
		TaxiVip bmw = new TaxiVip("BMW",30500,13,151);
		ArrayList<Taxi> cars = new ArrayList<Taxi>();

		cars.add(dacia);
		cars.add(daewoo);
		cars.add(toyota);		
		cars.add(honda);
		cars.add(mercedes);
		cars.add(bmw);

		for(Taxi car : cars){
			totalPrice += car.price;
		}
		System.out.println("Список автомобилей до сортировки");
		for(Taxi car : cars){
			System.out.println(car);
		}
		System.out.println("Стоимость автопарка: " + totalPrice);
		Collections.sort(cars, new MyComparator ());
		System.out.println("Список автомобилей после сортировки");
		for(Taxi car : cars){
			System.out.println(car);
		}
		System.out.println("Введите минимальную скорость: ");
		try {
			minSpeed = textInput.nextInt();
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Вы ввели недопустимые символы.");
		}
		System.out.println("Введите максимальную скорость: ");
		try {
			maxSpeed = textInput.nextInt();
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Вы ввели недопустимые символы.");
		}
		textInput.close();
		for(Taxi car : cars){
			if(car.speed>=minSpeed&&car.speed<=maxSpeed){
				System.out.println(car);
			}
		}
	}
}