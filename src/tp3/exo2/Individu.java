package tp3.exo2;

public class Individu {
	private String nom;
	private String prenom;
	private Individu conjoint;

	public Individu(String nom, String prenom, Individu conjoint) {
		this.nom = nom;
		this.prenom = prenom;
		this.conjoint = conjoint;
	}

	public Individu(String nom, String prenom) {
		this(nom, prenom, null);
	}

	public void marier(Individu id2) {
		if (id2 == null) {
			System.out.println("Mariage impossible : individu invalide.");
		} else if (id2 == this) {
			System.out.println("On peut pas se marier a soit meme");
		} else if (this.conjoint != null) {
			System.out.println("Vous etes déja marié(e), impossible de se marier");
		} else if (id2.conjoint != null) {
			System.out.println(id2.nom + " est déja marié(e), impossible de se marier");
		} else {
			this.conjoint = id2;
			id2.conjoint = this;
			System.out.println("Vous etes maintenant marié!");
		}
	}

	public void afficherInfo() {
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		if (conjoint == null) {
			System.out.println("Conjoint : aucun");
		} else {
			System.out.println("Conjoint : " + conjoint.nom + " " + conjoint.prenom);
		}
	}
}
