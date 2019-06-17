package zoo;

import java.util.ArrayList;

public class Vlk extends ArrayList implements AnimalInterface {
	
	double weight = 22;

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String doSound() {
		// TODO Auto-generated method stub
		return "howl";
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "wolf";
	}

}
