package tp6_7.exo;

public class Polygone {

	private Point[] sommets;

	public Polygone(Point[] sommets) {
		this.sommets = sommets;
	}

	public Polygone(int nbSommets) {
		this.sommets = new Point[nbSommets];
	}

	public void setUnSommet(Point p, int pos) {
		sommets[pos] = p;
	}

	public void setSommets(Point[] sommets) {
		this.sommets = sommets;
	}

	protected String nomFigure() {
		return "Polygone";
	}

	public int nombreDeSommets() {
		return sommets.length;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(nomFigure());
		sb.append("[");
		for (int i = 0; i < sommets.length; i++) {
			sb.append(sommets[i]);
			sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}

	public void affiche() {
		System.out.println(this);
	}

	public float perimetre() {
		float peri = 0.0f;
		for (int i = 0; i < sommets.length - 1; i++) {
			peri += sommets[i].distance(sommets[i + 1]);
		}
		peri += sommets[sommets.length - 1].distance(sommets[0]);
		return peri;
	}
}
