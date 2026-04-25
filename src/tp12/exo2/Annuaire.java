package tp12.exo2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

// Cette classe permet de créer un fichier structuré d'employés à partir
// d'informations placées dans un vecteur.
// Elle propose également des méthodes pour lire et afficher à l'écran
// les enregistrements du fichier
public class Annuaire {

	private List<Employe> collectionEmployes;
	private RandomAccessFile fichierAnnuaire;
	private int nbEmployes;

	// Constructeur
	public Annuaire(List<Employe> cemp, RandomAccessFile rf) {
		this.collectionEmployes=cemp;
		this.fichierAnnuaire=rf;
	}

	// Méthode privée pour obtenir une chaîne de longueur fixe.
	// Compléter avec des espaces si la longueur est inférieure à la longueur souhaitée
	// Tronquer si la taille dépasse la longueur indiquée
	private String formatChaine(String chaine, int longueur) {
	    if (chaine.length() > longueur) {
	        chaine = chaine.substring(0, longueur);
	    } else {
	        while (chaine.length() < longueur) {
	            chaine = chaine + " ";
	        }
	    }
	    return chaine;
	}

	// Recopie de la collection des employés dans le fichier structuré
	public void creerAnnuaire() throws IOException {
		Iterator<Employe> it = collectionEmployes.iterator();
		while (it.hasNext()) {
			Employe emp = (Employe) it.next();
			// Écriture dans fichierAnnuaire
			fichierAnnuaire.writeInt(emp.getNumero());
			fichierAnnuaire.writeChars(formatChaine(emp.getNom(), 20));
			fichierAnnuaire.writeChars(formatChaine(emp.getAdresse(), 40));
			fichierAnnuaire.writeChars(formatChaine(emp.getTelephone(), 20));
			fichierAnnuaire.writeDouble(emp.getSalaire());
			nbEmployes++;
		}
		System.out.println("Annuaire créé avec succès !!!!");
	}

	// Méthode de lecture d'une chaîne de caractères dans fichierAnnuaire
	// Il faut utiliser la méthode readChar() de la classe RandomAccessFile
	private String lireChaine(int nbcars) throws IOException {
		String chaine = "";
		for (int i = 0; i < nbcars; i++) {
			chaine = chaine + fichierAnnuaire.readChar();
		}
		return chaine;
	}

	// Lecture d'un employé dans le fichier annuaire
	private Employe lireUnEmploye(int pos) throws IOException {
		Employe emp = new Employe();
		System.out.println("lecture de l'enregistrement à la position " + pos);
		fichierAnnuaire.seek(pos * 172);
		emp.setNumero(fichierAnnuaire.readInt());
		emp.setNom(lireChaine(20));
		emp.setAdresse(lireChaine(40));
		emp.setTelephone(lireChaine(20));
		emp.setSalaire(fichierAnnuaire.readDouble());
		return emp;
	}

	// Affichage d'un employé
	public void afficherEmploye(int pos) throws IOException {
		for(int i=0;i<collectionEmployes.size();i++) {
			if(i==pos) {
				collectionEmployes.get(i).afficher();
			}
		}
	}

	// Nombre d'employés dans l'annuaire
	public int getNbEmploye() {
		return collectionEmployes.size();
	}
}