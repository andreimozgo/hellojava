package TaxiProject;

public class TaxiRegular extends Taxi implements ChangeSeatsNumber, EconomyCar{
	public TaxiRegular(String carName, int price, int consumption, int speed){
		this.carName = carName;
		this.price = price;
		this.consumption = consumption;
		this.speed = speed;
	}

	public void changeSeatsNum(int seats){
		this.seats = seats; 
	}
	
	public void economyAccelerate(){
		speed += 8;
	}
}