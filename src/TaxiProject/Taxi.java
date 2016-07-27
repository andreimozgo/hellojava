package TaxiProject;

abstract public class Taxi {

	protected String carName;
	protected int price;
	protected int speed;
	protected int seats = 5;
	protected int consumption;
	int id;

	public void accelerate(){
		speed += 10;
	}

	public int getConsumption(){
		return consumption;
	}

	public String toString(){
		return carName + " " + price + " "+ consumption + " " + speed;
	}
	
    public boolean equals(Taxi other)
    {
        if(!super.equals(other)) return false;
        if (this == other) return true;
        if (other == null) return false;
        if(this.getClass() != other.getClass()) return false;
        Taxi otherObj = (Taxi)other;
        return this.id == otherObj.id;
    }
    public int hashCode()
    {   
        return 76+133*id;
    }
}