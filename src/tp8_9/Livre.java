package tp8_9;

public class Livre extends Document {
	private String isbn;
	private String auteur;
	private int nombrePages;

	public Livre(int numero, String isbn, String titre, String auteur, int nombrePages) {
		super(numero,titre);
		this.isbn=isbn;
		this.auteur=auteur;
		this.nombrePages=nombrePages;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuteur() {
		return auteur;
	}

	public int getNombrePages() {
		return nombrePages;
	}

	public String toString() {
		return super.toString() + ", ISBN : "+isbn+", Auteur : "+auteur+", nombre de pages : "+nombrePages;
	}
}
