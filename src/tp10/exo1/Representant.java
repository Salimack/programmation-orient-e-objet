package tp10.exo1;

public class Representant extends Commercial {
	
	public Representant(String nom,String prenom, int age,double CA) {
		super(nom,prenom,age,CA);
	}
	public double calculerSalaire() {
		return this.getCA()*0.25;
	}
}
