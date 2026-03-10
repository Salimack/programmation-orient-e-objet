package tp8_9;

public class Livre extends Document {
	private String auteur;
	private int nombrePages;
	
	public Livre(int numero,String titre,String auteur, int nombrePages) {
		super(numero,titre);
		this.auteur=auteur;
		this.nombrePages=nombrePages;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public int getNombrePages() {
		return nombrePages;
	}
	
	public String toString() {
		return super.toString() + "Auteur : "+auteur+", nombre de pages : "+nombrePages;
	}
}
