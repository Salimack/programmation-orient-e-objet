package tp8_9;

public class Roman extends Livre {
	private String prix;

	public Roman(int numero, String isbn, String titre, String auteur, int nombrePages, String prix) {
		super(numero, isbn, titre, auteur, nombrePages);
		this.prix = prix;
	}

	public String getPrix() {
		return prix;
	}

	public String toString() {
		return super.toString() + ", prix : " + prix;
	}
}
