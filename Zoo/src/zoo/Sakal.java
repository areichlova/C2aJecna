package zoo;

public class Sakal implements AnimalInterface {

	@Override
	public double getWeight() {
	
		return 7.0;
	}

	@Override
	public void setWeight(double weight) {

		
	}

	@Override
	public double foodConsumption() {
		return 2;
	}

	@Override
	public String doSound() {
		return "Hauuuuuuuuuu";
	}

	@Override
	public String whoAmI() {
		return "Jsem Šakal";
	}

	@Override
	public String toString() {
		return "Kdo jsem? " + whoAmI() + "Vážím? " + getWeight() + " kg, žeru: " + foodConsumption() + " kg za den a dìlám: "
				+ doSound() + " ";
	}

}
