package tp3.exo3;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0.0, 0.0);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(Point p) {
		double dx = p.getX() - this.x;
		double dy = p.getY() - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public void afficher() {
		System.out.println("(" + x + " , " + y + ")");
	}
}
