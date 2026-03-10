package tp2;

import javax.swing.JOptionPane;

public class Trinome {

	// Attributs
	private double a, b, c;
	private double delta;
	private double r1, r2;

	// Constructeur
	public Trinome(double c1, double c2, double c3) {
		a = c1;
		b = c2;
		c = c3;
		delta = 0.0;
		r1 = 0.0;
		r2 = 0.0;
	}

	// Méthode de calcul
	public void calculRacines() {
		delta = b * b - 4 * a * c;

		if (a == 0) {
			return;
		}

		if (delta > 0) {
			double sqrtDelta = Math.sqrt(delta);
			r1 = (-b + sqrtDelta) / (2 * a);
			r2 = (-b - sqrtDelta) / (2 * a);
		} else if (delta == 0) {
			r1 = (-b) / (2 * a);
			r2 = r1;
		}
	}

	// Affichage console
	public void afficheRacines() {
		if (a == 0) {
			System.out.println("Ce n'est pas une équation du second degré.");
			return;
		}

		if (delta > 0) {
			System.out.println("Deux racines réelles :");
			System.out.println("Racine 1 : " + r1);
			System.out.println("Racine 2 : " + r2);
		} else if (delta == 0) {
			System.out.println("Une racine réelle double :");
			System.out.println("Racine : " + r1);
		} else {
			System.out.println("Pas de racines réelles.");
		}
	}

	// Affichage JOptionPane
	public void afficheRacineJOptionPane() {
		if (delta > 0) {
			JOptionPane.showMessageDialog(null, "Racine 1 = " + r1 + "\nRacine 2 = " + r2);
		} else if (delta == 0) {
			JOptionPane.showMessageDialog(null, "Racine double = " + r1);
		} else {
			JOptionPane.showMessageDialog(null, "Pas de racines réelles.");
		}
	}
}
