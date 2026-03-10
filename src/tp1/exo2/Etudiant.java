package tp1.exo2;

public class Etudiant {
	private String nom;
	private double[] notes;
	private double moyenne;
	private String resultat;

	public Etudiant(String nom, double[] notes) {
		this.nom = nom;
		this.notes = notes;
		this.moyenne = 0.0;
		this.resultat = null;
	}

	public double getMoyenne() {
		double somme = 0.0;
		for (int i = 0; i < this.notes.length; i++) {
			somme += notes[i];
		}
		this.moyenne = somme / notes.length;
		return this.moyenne;
	}

	public String admission() {
		if (this.getMoyenne() >= 10.0) {
			this.resultat = "admis";
		} else {
			this.resultat = "non admis";
		}
		return this.resultat;
	}

	public void afficher() {
		System.out.println("Nom de l'étudiant : " + this.nom);
		for (int i = 0; i < this.notes.length; i++) {
			System.out.println("Note n°" + (i + 1) + " : " + this.notes[i]);
		}
		System.out.println("Moyenne = " + this.moyenne);
		System.out.println("L'étudiant est donc : " + this.resultat);
	}
}
