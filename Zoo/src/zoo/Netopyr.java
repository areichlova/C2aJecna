package zoo;

public class Netopyr implements AnimalInterface{
	double weight;
	double foodConsumption;
	String doSound;
	String whoAmI;
	

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		
	}

	@Override
	public double foodConsumption() {
		return foodConsumption;
	}

	@Override
	public String doSound() {
		return doSound;
	}

	@Override
	public String whoAmI() {
		return whoAmI;
	}

	public Netopyr(double weight, double foodConsumption, String doSound, String whoAmI) {
		super();
		this.weight = 10;
		this.foodConsumption = 1000;
		this.doSound = "piiiiisk";
		this.whoAmI = "netopyr";
	}
	
	
	@Override
	public String toString() {
		return "Netopyr [weight=" + weight + "g , foodConsumption=" + foodConsumption + "mosqitos , doSound=" + doSound
				+ ", whoAmI=" + whoAmI + "]";
	}

	
}
