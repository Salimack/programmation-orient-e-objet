package tp6_7.exo;

public class Carre extends Rectangle {

	public Carre(Point p, float cote) {
		super(p, cote, cote);
	}

	protected String nomFigure() {
		return "Carre";
	}
}
