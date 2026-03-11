package tp8_9;

public class MainBibliotheque {

    public static void main(String[] args) {

        Bibliotheque biblio = new Bibliotheque();

        // Création de quelques documents
        Livre l1 = new Livre(1, "978-2-07-040850-4", "Le Petit Prince", "Antoine de Saint-Exupéry", 96);
        Livre l2 = new Livre(2, "978-2-07-054234-6", "Harry Potter", "J.K. Rowling", 320);
        Roman r1 = new Roman(3, "978-2-07-040850-5", "Les Misérables", "Victor Hugo", 1500, "Prix Nobel");
        Revue rv1 = new Revue(4, "Science et Vie", "Mars", 2024);

        // Ajout dans la bibliothèque
        biblio.ajouter(l1);
        biblio.ajouter(l2);
        biblio.ajouter(r1);
        biblio.ajouter(rv1);

        // Affichage de tous les documents
        System.out.println("=== Documents de la bibliothèque ===");
        biblio.afficherDocuments();

        // Affichage des auteurs
        System.out.println("\n=== Auteurs dans la bibliothèque ===");
        biblio.afficherAuteurs();
    }
}
