package tp12.exo2;

public class Employe {
	private int numero;
	private String nom;
	private String adresse;
	private String telephone;
	private double salaire;

	// Constructeur vide
	public Employe() {}

	// Constructeur complet
	public Employe(int numero, String nom, String adresse, String telephone, double salaire) {
		this.numero    = numero;
		this.nom       = nom;
		this.adresse   = adresse;
		this.telephone = telephone;
		this.salaire   = salaire;
	}

	public void afficher() {
		System.out.println("Numero : " + numero + "\n Nom : " + nom + "\n Adresse : " + adresse + "\n Telephone : " + telephone + "\n Salaire : " + salaire);
	}

	public int    getNumero()    { return numero;    }
	public String getNom()       { return nom;       }
	public String getAdresse()   { return adresse;   }
	public String getTelephone() { return telephone; }
	public double getSalaire()   { return salaire;   }

	public void setNumero(int n)    { numero    = n; }
	public void setNom(String n)    { nom       = n; }
	public void setAdresse(String a){ adresse   = a; }
	public void setTelephone(String t){ telephone = t; }
	public void setSalaire(double s){ salaire   = s; }
}
