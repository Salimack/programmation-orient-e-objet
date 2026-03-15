package cc2024;

public class Commercial extends Employe {
	private String titre;
	private double prime;
	private int ventesMensuelles;
	
	public Commercial(String matricule, String nom, int tauxHoraire, int heuresSemaine, MyDate dateNaissance,String titre, double prime,int ventesMensuelles) {
		super( matricule,  nom,  tauxHoraire,  heuresSemaine,  dateNaissance);
		this.titre=titre;
		this.prime=prime;
		this.ventesMensuelles=ventesMensuelles;
	}
	public double salaire() {
		return super.salaire() + prime + (ventesMensuelles*0.10);
	}

	public String toString() {
		return "Commercial : \nInformations générales\n"+super.toString()+"\nInformations spécifiques\nTitre : "+ titre+"\nPrime : "+prime+"\nNombre de ventes mensuelles : "+ventesMensuelles;
	}
	
	
}
