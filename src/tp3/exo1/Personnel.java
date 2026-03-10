package tp3.exo1;

import javax.swing.JOptionPane;

public class Personnel {
	private String nom;
	private String prenom;
	private Sexe sexe;
	private short annee;
	private Situation situation;
	private String adresse;

	public Personnel() {
		this("", "", null, (short) 0, null, "");
	}

	public Personnel(String nom, String prenom, Sexe sexe, short annee, Situation situation, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.annee = annee;
		this.situation = situation;
		this.adresse = adresse;
	}

	public int age(short anneeA) {
		return anneeA - annee;
	}

	public void afficher() {
		String ne = "né en ";
		String pronom = ", il est ";
		if (sexe == Sexe.FEMME) {
			ne = "née en ";
			pronom = ", elle est ";
		}
		System.out.println(nom + " " + prenom + " est " + ne + annee + pronom
				+ situation.toString().toLowerCase() + " et habite a " + adresse + ".");
	}

	public void afficherJOPane() {
		String ne = "né en ";
		String pronom = ", il est ";
		if (sexe == Sexe.FEMME) {
			ne = "née en ";
			pronom = ", elle est ";
		}
		String message = nom + " " + prenom + " est " + ne + annee + pronom
				+ situation.toString().toLowerCase() + " et habite a " + adresse + ".";
		JOptionPane.showMessageDialog(null, message);
	}
}
