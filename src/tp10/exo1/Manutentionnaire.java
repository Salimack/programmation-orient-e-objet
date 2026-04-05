package tp10.exo1;

public abstract class Manutentionnaire extends Employe {
	private int nbHeures;

	public Manutentionnaire(String nom, String prenom, int age, int nbHeures) {
		super(nom, prenom, age);
		this.nbHeures = nbHeures;
	}

	public int getNbHeures() {
		return nbHeures;
	}
}
