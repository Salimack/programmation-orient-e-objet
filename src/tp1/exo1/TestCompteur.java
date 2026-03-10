package tp1.exo1;

public class TestCompteur {

	public static void main(String[] args) {
		Compteur c = new Compteur();
		c.incrementer();
		c.incrementer();
		c.incrementer();
		System.out.println("Valeur : " + c.getValeur());
		c.decrementer();
		System.out.println("Valeur : " + c.getValeur());
		c.raz();
		System.out.println("Valeur : " + c.getValeur());
	}
}
