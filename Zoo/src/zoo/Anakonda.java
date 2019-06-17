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
		return "Rád syèím";
	}

	@Override
	public String whoAmI() {
		return "Jsem Anakonda";
	}

	@Override
	public String toString() {
		return "Kdo jsem = " + whoAmI() + "Váha = " + getWeight() + " kg, jídlo = " + foodConsumption() + " kg, zvuk = "
				+ doSound() + " ";
	}

}
