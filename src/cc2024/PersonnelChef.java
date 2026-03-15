package cc2024;

public class PersonnelChef {
	private ChefEquipe[] chefEquipes;
	private int nbChefEquipe;

	public PersonnelChef(ChefEquipe[] chefEquipes) {
	    this.chefEquipes = chefEquipes;
	    this.nbChefEquipe = 0;
	}

	public PersonnelChef(int taille) {
	    this(new ChefEquipe[taille]);
	}

	public double salaireMoyen() {
		double moyen = 0.0;
		for(int i = 0; i < nbChefEquipe; i++) {
			moyen += chefEquipes[i].salaire();
		}
		return moyen / nbChefEquipe;
	}

	public void ajoutChefEquipe(ChefEquipe ce) {
		for(int i = 0; i < nbChefEquipe; i++) {
			if(chefEquipes[i].getMatricule().equals(ce.getMatricule())) {
				return;
			}
		}
		chefEquipes[nbChefEquipe] = ce;
		nbChefEquipe++;
	}

	public void afficherEquipe(String m) {
		for(int i = 0; i < nbChefEquipe; i++) {
			if(chefEquipes[i].getMatricule().equals(m)) {
				chefEquipes[i].afficherEquipe();
			}
		}
	}

	public boolean estMembre(String matriculeChef, String matriculeEmploye) {
		boolean res = false;
		for(int i = 0; i < nbChefEquipe; i++) {
			if(chefEquipes[i].getMatricule().equals(matriculeChef)) {
				res = chefEquipes[i].estMembre(matriculeEmploye);
			}
		}
		return res;
	}
}
