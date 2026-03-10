package tp1.exo2;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("salim", new double[] { 16.0, 10.0, 4.0 });
		e1.admission();
		e1.afficher();
	}
}
