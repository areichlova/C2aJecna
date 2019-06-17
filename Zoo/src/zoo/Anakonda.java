package zoo;

public class Anakonda implements AnimalInterface {

	@Override
	public double getWeight() {
	
		return 100.0;
	}

	@Override
	public void setWeight(double weight) {

		
	}

	@Override
	public double foodConsumption() {
		return 200;
	}

	@Override
	public String doSound() {
		return "R�d sy��m";
	}

	@Override
	public String whoAmI() {
		return "Jsem Anakonda";
	}

	@Override
	public String toString() {
		return "Kdo jsem = " + whoAmI() + "V�ha = " + getWeight() + " kg, j�dlo = " + foodConsumption() + " kg, zvuk = "
				+ doSound() + " ";
	}

}
