package tp10.exo2;

public class Pile {
	private int[] elements;
	private int sommet;

	public Pile(int taille) {
		this.elements = new int[taille];
		this.sommet = -1;
	}

	public boolean pileVide() {
		return sommet == -1;
	}

	public boolean pilePleine() {
		return sommet == elements.length - 1;
	}

	public void empiler(int val) throws PileException {
		if (pilePleine()) {
			throw new PileException(-2); // -2 = pile pleine
		}
		elements[++sommet] = val;
	}

	public int depiler() throws PileException {
		if (pileVide()) {
			throw new PileException(-1); // -1 = pile vide
		}
		return elements[sommet--];
	}

	public void viderPile() {
		sommet = -1;
	}

	public void afficherPile() throws PileException {
		if (pileVide()) {
			throw new PileException(-1);
		}
		for (int i = sommet; i >= 0; i--) {
			System.out.println("|" + elements[i] + "|");
		}
		System.out.println("----");
	}
}
