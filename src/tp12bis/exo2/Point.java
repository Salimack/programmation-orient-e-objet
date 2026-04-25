package tp12bis.exo2;

public class Point <t extends Number>{
	private t x;
	private t y;
	
	public Point(t x,t y) {
		this.x=x;
		this.y=y;
	}
	
	public Point() {
		this (null, null);
	}
}
