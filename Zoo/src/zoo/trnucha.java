package zoo;

import java.util.HashMap;

public class trnucha extends HashMap implements AnimalInterface {
	String jmeno;
	double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double foodConsumption() {
		return 0.55;
	}

	public String doSound() {
		return "gloglo";
	}

	public String whoAmI()

	{
		return jmeno;
	}
}
