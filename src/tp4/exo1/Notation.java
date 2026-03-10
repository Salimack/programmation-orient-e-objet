package tp4.exo1;

public class Notation {
	private double coef;
	private double note;

	public Notation(double coef, double note) {
		this.coef = coef;
		this.note = note;
	}

	public double getCoef() {
		return this.coef;
	}

	public double getNote() {
		return this.note;
	}

	public void afficher() {
		System.out.println("Note : " + this.note + "\n" + "Coef : " + this.coef);
	}
}
