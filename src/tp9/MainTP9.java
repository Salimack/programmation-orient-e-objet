package tp9;

import tp8_9.Document;
import tp8_9.Livre;
import tp8_9.Revue;

/**
 * Classe de test pour l'Exercice 1 – TP9-bis
 * Démontre l'utilisation correcte des iterators dans la classe Bibliotheque.
 */
public class MainTP9 {

    public static void main(String[] args) {

        Bibliotheque biblio = new Bibliotheque();

        // Création de quelques documents
        Livre l1 = new Livre(1, "978-2-07-036024-5", "Le Seigneur des Anneaux", "Tolkien", 1200);
        Livre l2 = new Livre(2, "978-2-07-040850-4", "Le Hobbit",               "Tolkien", 310);
        Livre l3 = new Livre(3, "978-2-07-040023-2", "Dune",                    "Herbert", 688);

        // Ajout dans la bibliothèque
        biblio.ajouter(l1);
        biblio.ajouter(l2);
        biblio.ajouter(l3);

        System.out.println("=== Tous les documents ===");
        biblio.afficherDocuments();

        System.out.println("\n=== Tous les auteurs ===");
        biblio.afficherAuteurs();

        // Test suppression via Iterator (Q4 / Q5)
        System.out.println("\n=== Suppression du document n°2 ===");
        Document aSupprimer = biblio.getDocumentByNumero(2);
        boolean ok = biblio.supprimer(aSupprimer);
        System.out.println("Suppression réussie : " + ok);

        System.out.println("\n=== Documents après suppression ===");
        biblio.afficherDocuments();

        // Test ajout d'un doublon (doit être refusé)
        System.out.println("\n=== Tentative d'ajout d'un doublon (n°1) ===");
        boolean doublon = biblio.ajouter(l1);
        System.out.println("Ajout accepté : " + doublon); // doit afficher false
    }
}
