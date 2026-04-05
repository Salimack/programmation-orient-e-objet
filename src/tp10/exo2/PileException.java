package tp10.exo2;

public class PileException extends Exception {
	private int codeErreur;

	public PileException(int codeErreur) {
		this.codeErreur = codeErreur;
	}

	public int getCodeErreur() {
		return codeErreur;
	}
}
