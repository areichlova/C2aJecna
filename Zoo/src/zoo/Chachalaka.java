package zoo;

public class Chachalaka implements AnimalInterface {

	
	/**
	 * @author michalCh
	 */
	double weight;

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;// Kg
	}

	@Override 
	public double foodConsumption() {

		return 400;// g
	}

	@Override
	public String doSound() {

		return "jajajajjajajjajajaja";
	}

	@Override
	public String whoAmI() {

		String jmeno = "Chachalaka hnìdokøídlá";
		String uvod = "Chachalaka hnìdokøídlá nebo té guan hnìdokøídlı patøí do øádu hraba­vıch (Galliformes), èeledi hokovitıch (Cracidae). Vy­skytuje se v oblastech od jiního Texasu pøes vı­chodní a jiní Mexiko a do Hondurasu. V Texasu ije chachalaka hnìdokøídlá v údolí øeky Rio Grande.";
		String popis = "Chachalaka hnìdokøidlá obıvá dešové pralesy, kde se zdruje podél vodních tokù, ale také v oblastech s vysokımi køovinami a hustou vegetací. Nìkte­øí jedinci ijí i na velmi suchıch místech, ale praktic­ky vdy na svazích. Ptáci se zpravidla zdrují v hus­tıch vìtvích, èasto v korunách vysokıch stromù. Zde ijí mnohdy ve spoleènosti sojek, rùznıch druhù ho­lubù apod. Jsou to ptáci vıluènì stromoví, ale pravi­delnì slétají na zem, kde hledají potravu. Guan hnìdokøídlı se iví bo­bulemi, èerstvımi zelenımi listy a vıhonky, pøípadnì i semeny. Obèas také sezobnou neopatrnı hmyz, kterı se jim na zemi pøiplete do cesty.";
		return jmeno + uvod + popis;
	}
	
	

}
