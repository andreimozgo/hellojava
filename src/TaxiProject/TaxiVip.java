package TaxiProject;

public class TaxiVip extends Taxi implements SportCar{

	public TaxiVip(String carName, int price, int consumption, int speed){
		this.carName = carName;
		this.price = price;
		this.consumption = consumption;
		this.speed = speed;
	}

	public void sportAccelerate(){
		speed += 20;
	}
}