package tp3.exo1;

import javax.swing.JOptionPane;

public class TestPersonnel {

	public static void main(String[] args) {
		// Premier objet (manuel)
		Personnel p1 = new Personnel(
				"Dulac",
				"Marie",
				Sexe.FEMME,
				(short) 1969,
				Situation.CELIBATAIRE,
				"10 rue des Saints Peres a Paris");

		p1.afficher();

		// Deuxième objet avec JOptionPane
		String nom = JOptionPane.showInputDialog("Nom :");
		String prenom = JOptionPane.showInputDialog("Prenom :");

		short annee = Short.parseShort(JOptionPane.showInputDialog("Annee de naissance :"));

		String adresse = JOptionPane.showInputDialog("Adresse :");

		Sexe sexe = Sexe.valueOf(JOptionPane.showInputDialog("Sexe (HOMME ou FEMME) :").toUpperCase());

		Situation situation = Situation.valueOf(
				JOptionPane.showInputDialog("Situation (CELIBATAIRE, MARIE, DIVORCE, VEUF) :").toUpperCase());

		Personnel p2 = new Personnel(nom, prenom, sexe, annee, situation, adresse);
		p2.afficherJOPane();
	}
}
