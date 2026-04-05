package tp10.exo1;

public class Main {
	public static void main(String[] args) {
		Personnel p = new Personnel();

		p.ajouterEmploye(new Vendeur("Dupont", "Jean", 30, 5000));
		p.ajouterEmploye(new Representant("Martin", "Marie", 25, 8000));
		p.ajouterEmploye(new TechnicienARisque("Bernard", "Paul", 40, 200));
		p.ajouterEmploye(new ManutARisque("Durand", "Luc", 35, 150));

		p.calculerSalaires();
		System.out.println("Salaire moyen : " + p.salaireMoyen() + " Euros.");
	}
}
