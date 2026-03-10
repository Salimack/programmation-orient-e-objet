package tp3.exo3;

public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public void afficher() {
		System.out.print("Point A : ");
		p1.afficher();
		System.out.print("Point B : ");
		p2.afficher();
		System.out.print("Point C : ");
		p3.afficher();
	}

	public boolean estIsocele() {
		double d1 = p1.distance(p2);
		double d2 = p2.distance(p3);
		double d3 = p3.distance(p1);
		return (d1 == d2 || d2 == d3 || d3 == d1);
	}
}
