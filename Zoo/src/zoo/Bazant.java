package zoo;

public class Bazant implements AnimalInterface {
	double weight;
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
		
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return weight/3;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "bazbaz";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "bazant";
	}
	

}
