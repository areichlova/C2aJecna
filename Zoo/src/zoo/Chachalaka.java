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
	if(weight < 0) {
			throw new RuntimeException("Nula ani míò!!!");
		}
		this.weight = weight;
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
		String uvod = "Chachalaka hnìdokøídlá nebo též guan hnìdokøídlý patøí do øádu hraba­vých (Galliformes), èeledi hokovitých (Cracidae). Vy­skytuje se v oblastech od jižního Texasu pøes vý­chodní a jižní Mexiko až do Hondurasu. V Texasu žije chachalaka hnìdokøídlá v údolí øeky Rio Grande.";
		String popis = "Chachalaka hnìdokøidlá obývá dešové pralesy, kde se zdržuje podél vodních tokù, ale také v oblastech s vysokými køovinami a hustou vegetací. Nìkte­øí jedinci žijí i na velmi suchých místech, ale praktic­ky vždy na svazích. Ptáci se zpravidla zdržují v hus­tých vìtvích, èasto v korunách vysokých stromù. Zde žijí mnohdy ve spoleènosti sojek, rùzných druhù ho­lubù apod. Jsou to ptáci výluènì stromoví, ale pravi­delnì slétají na zem, kde hledají potravu. Guan hnìdokøídlý se živí bo­bulemi, èerstvými zelenými listy a výhonky, pøípadnì i semeny. Obèas také sezobnou neopatrný hmyz, který se jim na zemi pøiplete do cesty.";
		return jmeno + uvod + popis;
	}
	
	

}
