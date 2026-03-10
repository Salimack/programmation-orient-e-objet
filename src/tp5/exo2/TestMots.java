package tp5.exo2;

import java.util.Scanner;

public class TestMots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer une phrase : ");
		String phrase = sc.nextLine();

		Mots mots = new Mots(phrase);
		System.out.println(mots.miroirMots());
		System.out.println(mots.mirroirLettres());

		sc.close();
	}
}
