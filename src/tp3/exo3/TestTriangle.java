package tp3.exo3;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		System.out.println("Utilisation de la classe Scanner !!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Xa : ");
		double Xa = sc.nextDouble();
		System.out.println("Ya : ");
		double Ya = sc.nextDouble();
		Point p1 = new Point(Xa, Ya);

		System.out.println("Xb : ");
		double Xb = sc.nextDouble();
		System.out.println("Yb : ");
		double Yb = sc.nextDouble();
		Point p2 = new Point(Xb, Yb);

		System.out.println("Xc : ");
		double Xc = sc.nextDouble();
		System.out.println("Yc : ");
		double Yc = sc.nextDouble();
		Point p3 = new Point(Xc, Yc);
		sc.close();

		Triangle tr = new Triangle(p1, p2, p3);
		tr.afficher();
		if (tr.estIsocele()) {
			System.out.println("Le triangle est isocèle.");
		} else {
			System.out.println("Le triangle n'est pas isocèle.");
		}
	}
}
