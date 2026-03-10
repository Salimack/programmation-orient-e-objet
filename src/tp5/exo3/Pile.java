package tp5.exo3;

public class Pile {
	private int sommet;
	private int[] elements;

	public Pile(int taille) {
		this.sommet = -1;
		this.elements = new int[taille];
	}

	private void erreur(String msg) {
		System.out.println("Erreur : " + msg);
	}

	public boolean pileVide() {
		return (sommet == -1);
	}

	public void empiler(int element) {
		if (sommet < elements.length - 1) {
			sommet++;
			elements[sommet] = element;
		} else {
			erreur("Pile pleine!!!");
		}
	}

	public int depiler() {
		int val = 0;
		if (!pileVide()) {
			val = elements[sommet];
			sommet--;
		} else {
			erreur("Pile vide !!!");
		}
		return val;
	}

	public void viderPile() {
		sommet = -1;
	}

	public void afficher() {
		if (pileVide()) {
			erreur("Pile vide !!!");
		} else {
			for (int i = sommet; i >= 0; i--) {
				System.out.println("|" + elements[i] + "|");
				if (i == 0) {
					System.out.println("----");
				}
			}
			System.out.println();
		}
	}
}
