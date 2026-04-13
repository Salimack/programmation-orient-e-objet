package tp11.exo3;

public class PointPhysiqueColore<TypeDesPoints extends Number> extends PointColore<TypeDesPoints>{
	private int poids;
	
	public PointPhysiqueColore(TypeDesPoints x, TypeDesPoints y, String couleur,int poids) {
		super(x,y,couleur);
		this.poids=poids;
		
	}
	
	public void afficher() {
	    super.afficher();
	    System.out.println("poids : " + poids);
	}
}
