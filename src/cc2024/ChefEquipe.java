package cc2024;

import java.util.List;
import java.util.ArrayList;

public class ChefEquipe extends Employe {
	private String titre;
	private double prime;
	private List<Employe> equipe;

	public ChefEquipe(String matricule, String nom, int tauxHoraire, int heuresSemaine, MyDate dateNaissance,String titre, double prime, List<Employe> equipe) {
		super( matricule,  nom,  tauxHoraire,  heuresSemaine,  dateNaissance);
		this.titre=titre;
		this.prime=prime;
		this.equipe = equipe;

	}
	
	public ChefEquipe(String matricule, String nom, int tauxHoraire, int heuresSemaine, MyDate dateNaissance,String titre, double prime) {
		this(matricule, nom, tauxHoraire, heuresSemaine, dateNaissance, titre, prime, new ArrayList<Employe>());
	}
	
	public double salaire() {
		return super.salaire()+prime;
	}
	
	public boolean estMembre(String matricule) {
		boolean res = false;
		for(Employe em : this.equipe) {
			if(em.getMatricule().equals(matricule)) {
				res=true;
			}
		}
		return res;
	}
	
	public void afficherEquipe() {
		for(Employe em : this.equipe) {
			System.out.print(em);
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Chef d'équipe : \nInformations générales\n" + super.toString() +
				"\nInformations spécifiques\nTitre : "+titre+
				"\nPrime : "+prime+" €\n");
		sb.append("Liste des membres de l'équipe :\n");
		for(Employe em : this.equipe) {
			sb.append(em.toString()).append("\n");
		}
		return sb.toString();
		
		
	}
}
