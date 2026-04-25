package tp12.exo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class ListeEmployes {

	private List<Employe> employes;
	private BufferedReader bfr;

	// Constructeur
	public ListeEmployes(String nomFichier) {
		employes = new ArrayList<Employe>();
		try {
			// Création d'un flux pour le fichier text. Le nom du fichier est passé en paramètre
			FileReader in = new FileReader(nomFichier);
			bfr = new BufferedReader(in);
		} catch (IOException e) {
			System.out.println("Pb entrée sortie :" + e.getMessage());
		}
	}

	// Transforme une chaîne en un objet de type Employe
	// Format de la chaîne : 1*BARBE*Rue des Vignes Paris*0123546789*10000
	private Employe fabriqueEmploye(String chaine) {
		StringTokenizer st = new StringTokenizer(chaine, "*");
		int numero       = Integer.parseInt(st.nextToken());
		String nom       = st.nextToken();
		String adresse   = st.nextToken();
		String telephone = st.nextToken();
		double salaire   = Double.parseDouble(st.nextToken());
		Employe emp = new Employe(numero, nom, adresse, telephone, salaire);
		return emp;
	}

	// Transformer le fichier complet en un vecteur d'employés
	public void remplirVecteur() {
		String chaine;
		Employe emp;
		try {
			do {
				chaine = bfr.readLine();
				if (chaine != null) {
					emp = fabriqueEmploye(chaine);
					employes.add(emp);
				}
			} while (chaine != null);
		} catch (IOException e) {
			System.out.println("Problème de lecture : " + e.getMessage());
		}
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	// Affiche le contenu du vecteur d'employés.
	// Vous devez utiliser pour cela un itérateur explicite
	public void afficher() {
		Iterator<Employe> it = employes.iterator();
		while (it.hasNext()) {
		    Employe emp = it.next();
		    emp.afficher();
		}
	}

}
