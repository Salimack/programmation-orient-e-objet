package tp4.exo1;

public class Etudiant {
	private String nom;
	private double moyenne;
	private String avis;
	private Notation[] notation;

	public Etudiant(String nom, Notation[] notation) {
		this.nom = nom;
		this.notation = notation;
		this.moyenne = 0.0;
		this.avis = null;
	}

	public double Moyenne() {
		double somme = 0.0;
		double coef = 0.0;
		for (int i = 0; i < this.notation.length; i++) {
			somme += notation[i].getNote() * notation[i].getCoef();
			coef += notation[i].getCoef();
		}
		this.moyenne = somme / coef;
		return this.moyenne;
	}

	public void avis() {
		if (this.moyenne >= 10.0) {
			this.avis = "favorable";
		} else {
			this.avis = "non favorable";
		}
	}

	public void afficher() {
		Moyenne();
		System.out.println("Nom : " + nom + "\n" + moyenne);
		for (int i = 0; i < notation.length; i++) {
			System.out.println("Note n°" + (i + 1) + " : " + notation[i].getNote()
					+ " Coef : " + notation[i].getCoef());
		}
		System.out.printf("Moyenne : %.2f%n", this.moyenne);
		System.out.println(avis);
	}
}
