package TaxiProject;
/**TaxiVip class used for expensive and sport cars.
 * It extends from Taxi and inplements sportCar interfase.
 * @author Mozgo Andrei
 */
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