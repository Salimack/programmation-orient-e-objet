package tp4.exo2;

public class TriNombres {
	int[] tab;

	public TriNombres(int taille) {
		this(new int[taille]);
	}

	public TriNombres(int[] tab) {
		this.tab = tab;
	}

	public void trier() {
		for (int i = 0; i < this.tab.length - 1; i++) {
			int indiceMin = i;
			for (int j = i + 1; j < this.tab.length; j++) {
				if (this.tab[j] < this.tab[indiceMin]) {
					indiceMin = j;
				}
			}
			// échange
			int temp = this.tab[i];
			this.tab[i] = this.tab[indiceMin];
			this.tab[indiceMin] = temp;
		}
	}

	public void afficher() {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + " ");
		}
		System.out.println();
	}
}
