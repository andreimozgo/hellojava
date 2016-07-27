package TaxiProject;

public class TaxiEconomy extends Taxi implements EconomyCar{

	public TaxiEconomy(String carName, int price, int consumption, int speed){
		this.carName = carName;
		this.price = price;
		this.consumption = consumption;
		this.speed = speed;
	}

	public void economyAccelerate(){
		speed += 5;
	}
}
