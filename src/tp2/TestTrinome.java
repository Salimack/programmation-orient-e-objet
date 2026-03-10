package tp2;

import javax.swing.JOptionPane;

public class TestTrinome {

	public static void main(String[] args) {
		System.out.println("Utilisation de la classe JOptionPane !!!");

		String s;

		s = JOptionPane.showInputDialog("Valeur de a ?");
		double a = Double.parseDouble(s);

		s = JOptionPane.showInputDialog("Valeur de b ?");
		double b = Double.parseDouble(s);

		s = JOptionPane.showInputDialog("Valeur de c ?");
		double c = Double.parseDouble(s);

		Trinome t = new Trinome(a, b, c);
		t.calculRacines();
		t.afficheRacineJOptionPane();
	}
}
