package tp11.exo3;

public class PointColore<TypeDesPoints extends Number> extends PointBis<TypeDesPoints> {
	private String couleur;
	
	public PointColore(TypeDesPoints x, TypeDesPoints y, String couleur) {
		super(x,y);
		this.couleur=couleur;
	}

	public void afficher() {
	    super.afficher();
	    System.out.println("couleur : " + couleur);
	}
}
