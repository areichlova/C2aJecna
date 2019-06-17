package zoo;

public class Kralik implements AnimalInterface {
	private double weight;
	private String druh;

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double foodConsumption() {
		return 0.03 * getWeight();
	}

	@Override
	public String doSound() {
		return "Hmm, hmm, hmm";
	}

	@Override
	public String whoAmI() {
		return "Já jsem " + druh;
	}

	public Kralik(int weight) {
		this.weight = weight;
		this.druh = "Králík";
		System.out.println("Králík se zrodil");
	}

	public String toString() {
		return whoAmI() + " a dìlám " + doSound() + ". Vážím " + getWeight() + " kilogramù. Sním " + foodConsumption()
				+ " gramù jídla.";
	}
}
