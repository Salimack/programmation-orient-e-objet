package tp5.exo3;

import java.util.Scanner;

public class TestPile {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer une taille");
		Scanner sc = new Scanner(System.in);
		int taille = sc.nextInt();
		Pile p = new Pile(taille);
		p.empiler(3);
		p.empiler(4);
		p.empiler(5);
		p.empiler(6);
		p.empiler(3);
		p.afficher();
		p.depiler();
		p.afficher();
		sc.close();
	}
}
