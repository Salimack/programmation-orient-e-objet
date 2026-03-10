package tp6_7.exo;

public class Point {

	private float x;
	private float y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0.0f, 0.0f);
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float distance(Point p) {
		return (float) Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public void affiche() {
		System.out.println(this);
	}
}
