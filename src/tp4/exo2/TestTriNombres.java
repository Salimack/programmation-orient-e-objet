package tp4.exo2;

public class TestTriNombres {
	public static void main(String[] args) {
		TriNombres tab = new TriNombres(new int[] { 35, 6, 2, 66, 100, 36, 11, 1, 6, 14 });
		tab.afficher();
		tab.trier();
		tab.afficher();
	}
}
