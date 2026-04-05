package tp10.exo1;

public abstract class Technicien extends Employe {
	private int nbUnites;

	public Technicien(String nom, String prenom, int age, int nbUnites) {
		super(nom, prenom, age);
		this.nbUnites = nbUnites;
	}

	public int getNbUnites() {
		return nbUnites;
	}
}
