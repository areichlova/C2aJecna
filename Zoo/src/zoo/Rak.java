package zoo;

public class Rak implements AnimalInterface {
	private double weight;
	private boolean isMarine;

	public boolean isMarine() {
		return isMarine;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		if(weight < 0) {
			throw new RuntimeException("Weight not zero");
		}
		this.weight = weight;
		
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "RRRR!";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "rak";
	}

}
