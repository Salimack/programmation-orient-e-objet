package tp10.exo1;

public class TechnicienARisque extends Technicien implements ARisque {

	public TechnicienARisque(String nom, String prenom, int age, int nbUnites) {
		super(nom, prenom, age, nbUnites);
	}

	public double calculerSalaire() {
		return getNbUnites() * 5 + PRIME;
	}
}
