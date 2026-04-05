package tp10.exo1;

public class ManutARisque extends Manutentionnaire implements ARisque {

	public ManutARisque(String nom, String prenom, int age, int nbHeures) {
		super(nom, prenom, age, nbHeures);
	}

	public double calculerSalaire() {
		return getNbHeures() * 20 + PRIME;
	}
}
