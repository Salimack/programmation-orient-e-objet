package tp8_9;

import java.util.List;
import java.util.ArrayList;

public class Bibliotheque {

    // Attributs
    private List<Document> documents;

    // Constructeurs
    public Bibliotheque() {
    	this.documents = new ArrayList<Document>();
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

    // Obtenir un document par son numéro
    public Document getDocumentByNumero(int numero) {
        for (Document d : documents) {
            if (d.getNumero() == numero) {
                return d;
            }
        }
        return null;
    }

    // Menu de gestion de la bibliothèque
    public void menu() {
        int rep = 0;
        DocumentFactory factory = new DocumentFactory();
        while (rep != -1) {
            System.out.println("**************MENU PRINCIPAL*************");
            System.out.println("1 ===>  Ajouter un nouveau document");
            System.out.println("2 ===>  Afficher tous les documents");
            System.out.println("3 ===>  Afficher tous les auteurs");
            System.out.println("4 ===>  Supprimer un document par son numéro");
            System.out.println("-1 ===> Quitter");
            System.out.println("********************************************");
            rep = Saisie.lireEntier("Votre choix ? ");
            if (rep == 1) {
                String typeDocument = Saisie.lireChaine("Donnez le type de document à ajouter");
                Document d = factory.getDocument(typeDocument);
                if (d != null) {
                    ajouter(d);
                    System.out.println("Document ajouté !");
                } else {
                    System.out.println("Type de document non reconnu.");
                }
            }
            else if (rep == 2) {
                afficherDocuments();
            }
            else if (rep == 3) {
                afficherAuteurs();
            }
            else if (rep == 4) {
                int numero = Saisie.lireEntier("Numero du document à supprimer ? ");
                Document document = this.getDocumentByNumero(numero);
                if (document != null) {
                    supprimer(document);
                    System.out.println("Document supprimé !");
                }
                else System.out.println("Ce document n'existe pas...");
            }
        }// fin while
    } // fin méthode menu
}
