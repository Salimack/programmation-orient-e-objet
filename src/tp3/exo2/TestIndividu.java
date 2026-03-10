package tp3.exo2;

import java.util.Scanner;

public class TestIndividu {

	public static void main(String[] args) {
		System.out.println("Utilisation de la classe Scanner !!!");
		System.out.println("Nom ?");
		Scanner lc = new Scanner(System.in);
		String nom = lc.nextLine();

		System.out.println("Prenom ?");
		String prenom = lc.nextLine();

		Individu id1 = new Individu(nom, prenom, null);
		id1.afficherInfo();

		System.out.println("Nom ?");
		nom = lc.nextLine();
		System.out.println("Prenom ?");
		prenom = lc.nextLine();

		Individu id2 = new Individu(nom, prenom, null);
		id2.afficherInfo();
		lc.close();

		id1.marier(id2);
		id2.afficherInfo();
	}
}
