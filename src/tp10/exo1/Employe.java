package tp10.exo1;

public abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	
	public Employe(String nom,String prenom,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	
	public abstract double calculerSalaire();
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
	    return "L'employé " + prenom + " " + nom + " " + age;
	}
}
