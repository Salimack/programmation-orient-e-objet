package tp1.exo1;

public class Compteur {
	private int valeur;

	public Compteur() {
		valeur = 0;
	}

	public Compteur(int valeur) {
		this.valeur = valeur;
	}

	public void incrementer() {
		this.valeur++;
	}

	public void decrementer() {
		this.valeur--;
	}

	public void raz() {
		this.valeur = 0;
	}

	public int getValeur() {
		return this.valeur;
	}
}
