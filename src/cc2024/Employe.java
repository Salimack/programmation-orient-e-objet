package cc2024;


public class Employe {
	private String matricule;
	private String nom;
	private int tauxHoraire;
	private int heuresSemaine;
	private MyDate dateNaissance;
	
	public Employe(String matricule, String nom, int tauxHoraire, int heuresSemaine, MyDate dateNaissance) {
		this.matricule=matricule;
		this.nom=nom;
		this.tauxHoraire=tauxHoraire;
		this.heuresSemaine=heuresSemaine;
		this.dateNaissance=dateNaissance;
		
	}
	
	public double salaire() {
		return (double) tauxHoraire*heuresSemaine*4;
		
	}
	
	public String getMatricule() {
		return matricule;
	}
	
	public void afficher() {
		System.out.println(this);
	}
	
	public String toString() {
		double salaire = this.salaire();
		return "Matricule : "+matricule +"\nNom : "+nom+"\nDate de naissance : "+dateNaissance+"\nSalaire : "+salaire+" €";
	}
	
	
	
}
