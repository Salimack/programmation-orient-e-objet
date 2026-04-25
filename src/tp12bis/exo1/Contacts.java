package tp12bis.exo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import tp12.exo2.Employe;

import java.util.List;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Contacts {
    private List<Contact> mesContacts;
    private BufferedReader bfr;

    // Initialisation des attributs mesContacts et bfr
    public Contacts(String cheminFichier) {
    	mesContacts =  new Vector<Contact>();
        try {
        	FileReader in = new FileReader(cheminFichier);
        	bfr = new BufferedReader(in);
        } catch (/* TO DO */ Exception e) {
            // TO DO
        }
    }

    // transformation d'une chaine de caractères en un objet de type Contact
    // format de la chaine : 1*Thomas*BARBE*thomas.barbe@gmail.com
    private Contact contactFactory(String chaine) {
        Contact contact = new Contact();
        StringTokenizer st = new StringTokenizer(chaine,"*");
        int numero = Integer.parseInt(st.nextToken());
        String prenom = st.nextToken();
        String nom = st.nextToken();
        String email = st.nextToken();
        contact.setNumero(numero);
        contact.setPrenom(prenom);
        contact.setNom(nom);
        contact.setEmail(email);
        return contact;
    }

    // Recopie de tout le contenu du fichier dans le vecteur mesContacts
    public void fileToMesContacts() {
        String chaine;
        Contact contact;
        try {
            do {
                chaine=bfr.readLine();
                if(chaine!= null) {
                	contact = contactFactory(chaine);
                	mesContacts.add(contact);
                }

            } while (/* TO DO */);
        } catch (/* TO DO */ Exception e) {
            // TO DO
        }
    }

    // Redéfinition de la méthode toString() : retour d'une chaine contenant
    // tous les contacts
    @Override
    public String toString() {
    	Iterator<Contact> it = mesContacts.iterator();
		while (it.hasNext()) {
			Contact contact = it.next();
			contact.toString();
    }

    // Retourne true ou false selon que le contact dont le nom et le prénom
    // passés en argument est un élément de mesContacts ou non
    public boolean estDansMesContacts(String nom, String prenom) {
        boolean trouve = false;
        // TO DO
        return trouve;
    }
}
