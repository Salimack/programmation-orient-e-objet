package tp10.exo2;

public class TestPile {
	public static void main(String[] args) {
		Pile p = new Pile(3);

		try {
			p.empiler(10);
			p.empiler(20);
			p.empiler(30);
			p.afficherPile();

			// Tenter d'empiler sur une pile pleine
			p.empiler(40);

		} catch (PileException e) {
			if (e.getCodeErreur() == -2) {
				System.out.println("Erreur : pile pleine ! (code " + e.getCodeErreur() + ")");
			}
		}

		try {
			p.viderPile();
			// Tenter de dépiler une pile vide
			p.depiler();

		} catch (PileException e) {
			if (e.getCodeErreur() == -1) {
				System.out.println("Erreur : pile vide ! (code " + e.getCodeErreur() + ")");
			}
		}
	}
}
