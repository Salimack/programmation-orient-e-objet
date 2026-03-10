package tp6_7.exo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestionPolygones gestion = new GestionPolygones();

		System.out.print("Combien de figures veux-tu créer ? ");
		int n = sc.nextInt();

		for (int k = 0; k < n; k++) {
			System.out.println("\n--- Figure " + (k + 1) + " ---");
			System.out.println("Choisis le type : 1=Polygone  2=Rectangle(2 points)  3=Rectangle(point+L+l)  4=Carre(point+cote)");
			int choix = sc.nextInt();

			if (choix == 1) {
				System.out.print("Nombre de sommets ? ");
				int nb = sc.nextInt();
				Polygone p = new Polygone(nb);
				for (int i = 0; i < nb; i++) {
					System.out.print("x" + i + " ? ");
					float x = sc.nextFloat();
					System.out.print("y" + i + " ? ");
					float y = sc.nextFloat();
					p.setUnSommet(new Point(x, y), i);
				}
				gestion.ajouterPolygone(p);

			} else if (choix == 2) {
				System.out.print("x1 ? "); float x1 = sc.nextFloat();
				System.out.print("y1 ? "); float y1 = sc.nextFloat();
				System.out.print("x2 ? "); float x2 = sc.nextFloat();
				System.out.print("y2 ? "); float y2 = sc.nextFloat();
				Rectangle r = new Rectangle(new Point(x1, y1), new Point(x2, y2));
				gestion.ajouterPolygone(r);

			} else if (choix == 3) {
				System.out.print("x ? "); float x = sc.nextFloat();
				System.out.print("y ? "); float y = sc.nextFloat();
				System.out.print("longueur ? "); float L = sc.nextFloat();
				System.out.print("largeur ? ");  float l = sc.nextFloat();
				Rectangle r = new Rectangle(new Point(x, y), L, l);
				gestion.ajouterPolygone(r);

			} else if (choix == 4) {
				System.out.print("x ? "); float x = sc.nextFloat();
				System.out.print("y ? "); float y = sc.nextFloat();
				System.out.print("cote ? "); float cote = sc.nextFloat();
				Carre c = new Carre(new Point(x, y), cote);
				gestion.ajouterPolygone(c);

			} else {
				System.out.println("Choix invalide, on saute cette figure.");
			}
		}

		System.out.println("\n===== AFFICHAGE DES FIGURES =====");
		gestion.affiche();

		System.out.println("\n===== AFFICHAGE DES PERIMETRES =====");
		gestion.affichePerimetres();

		if (gestion.nombreTotal() > 0) {
			System.out.println("\n===== PLUS GRAND PERIMETRE =====");
			Polygone max = gestion.plusGrandPerimetre();
			System.out.println("Figure avec le plus grand perimetre : " + max);
			System.out.println("Perimetre = " + max.perimetre());
		}

		sc.close();
	}
}
