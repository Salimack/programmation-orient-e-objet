package tp10.exo1;

public abstract class Commercial extends Employe {
	private double CA;

	public Commercial(String nom,String prenom, int age,double CA) {
		super(nom,prenom,age);
		this.CA=CA;
	}

	public double getCA() {
		return CA;
	}
	
	
}