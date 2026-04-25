package tp12.exo1;

public class TestEmploye {

	public static void main(String[] args) {
		ListeEmployes liste = new ListeEmployes("C:\\Users\\sasag\\Desktop\\txttp12.txt");		
		liste.remplirVecteur();
		liste.afficher();
	}

}
