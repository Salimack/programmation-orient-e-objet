package tp6_7.exo;

public class Rectangle extends Polygone {

	public Rectangle(Point p1, Point p2) {
		super(4);
		setUnSommet(p1, 0);
		Point p3 = new Point(p2.getX(), p1.getY());
		setUnSommet(p3, 1);
		setUnSommet(p2, 2);
		Point p4 = new Point(p1.getX(), p2.getY());
		setUnSommet(p4, 3);
	}

	public Rectangle(Point p, float longueur, float largeur) {
		super(4);
		float x = p.getX();
		float y = p.getY();
		setUnSommet(p, 0);
		Point p2 = new Point(x + longueur, y);
		setUnSommet(p2, 1);
		Point p3 = new Point(x + longueur, y + largeur);
		setUnSommet(p3, 2);
		Point p4 = new Point(x, y + largeur);
		setUnSommet(p4, 3);
	}

	protected String nomFigure() {
		return "Rectangle";
	}
}
