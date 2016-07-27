package TaxiProject;
import java.util.Objects;
/**Abstract class Taxi used with TaxiRegular, TaxiEconomy and 
 * TaxiVip classes
 * @author Mozgo Andrei
 */
abstract public class Taxi {

	protected String carName;
	protected int price;
	protected int speed;
	protected int seats = 5;
	protected int consumption;

	public void accelerate(){
		speed += 10;
	}

	public int getConsumption(){
		return consumption;
	}

	public String toString(){
		return carName + " " + price + " "+ consumption + " " + speed;
	}

	public boolean equals(Taxi other){
		if (other == null||this == null) return false;
		if (this == other) return true;
		if(this.getClass() != other.getClass()) return false;
		if (this.carName!=other.carName) return false;
		if (this.price!=other.price) return false;
		if (this.speed!=other.speed) return false;
		if (this.seats!=other.seats) return false;
		if (this.consumption!=other.consumption) return false;
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carName, price, speed, seats, consumption);
	}
}