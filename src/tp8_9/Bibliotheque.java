package tp8_9;

import java.util.List;
import java.util.ArrayList;

public class Bibliotheque {

    // Attributs
    private List<Document> documents;

    // Constructeurs
    public Bibliotheque() {
    	this.documents = new ArrayList<>();
    }

    // Affichage de tous les documents de la bibliothèque
    public void afficherDocuments() {
    	for(Document d : documents) {
    		d.afficher();
    	}
    }

    // Afficher tous les auteurs de la bibliothèque.
    // Attention, seuls les documents de type Livre et Roman possèdent des auteurs
    public void afficherAuteurs() {
    	for(Document d : documents) {
    		if(d instanceof Livre) {
    			System.out.println(((Livre)d).getAuteur());
    		}
    	}
    }

    // Supprimer un document de la collection de documents
    public boolean supprimer(Document doc) {
        boolean res = false;
        res = documents.remove(doc);
        return res;
    }

    // Ajouter un document
    public boolean ajouter(Document doc) {
    	boolean res = false;
    	if(!documents.contains(doc)) {
    		documents.add(doc);
    		res = true;
    	}
    	return res;
    }

    // Obtenir le document à l'indice i
    public Document getUnDocument(int i) {
    	return documents.get(i);
    }
}
