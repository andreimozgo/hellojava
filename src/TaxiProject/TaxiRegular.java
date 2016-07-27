package TaxiProject;
/**TaxiRegular class used for regular cars.
 * It extends from Taxi and inplements EconomyCar interfase
 * and ChangeSeatsNumber interface for minivans.
 * @author Mozgo Andrei
 */
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