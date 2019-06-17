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
			throw new RuntimeException("Nula ani m��!!!");
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

		String jmeno = "Chachalaka hn�dok��dl�";
		String uvod = "Chachalaka hn�dok��dl� nebo t� guan hn�dok��dl� pat�� do ��du hraba�v�ch (Galliformes), �eledi hokovit�ch (Cracidae). Vy�skytuje se v oblastech od ji�n�ho Texasu p�es v��chodn� a ji�n� Mexiko a� do Hondurasu. V Texasu �ije chachalaka hn�dok��dl� v �dol� �eky Rio Grande.";
		String popis = "Chachalaka hn�dok�idl� ob�v� de��ov� pralesy, kde se zdr�uje pod�l vodn�ch tok�, ale tak� v oblastech s vysok�mi k�ovinami a hustou vegetac�. N�kte��� jedinci �ij� i na velmi such�ch m�stech, ale praktic�ky v�dy na svaz�ch. Pt�ci se zpravidla zdr�uj� v hus�t�ch v�tv�ch, �asto v korun�ch vysok�ch strom�. Zde �ij� mnohdy ve spole�nosti sojek, r�zn�ch druh� ho�lub� apod. Jsou to pt�ci v�lu�n� stromov�, ale pravi�deln� sl�taj� na zem, kde hledaj� potravu. Guan hn�dok��dl� se �iv� bo�bulemi, �erstv�mi zelen�mi listy a v�honky, p��padn� i semeny. Ob�as tak� sezobnou neopatrn� hmyz, kter� se jim na zemi p�iplete do cesty.";
		return jmeno + uvod + popis;
	}
	
	

}
