package tp8_9;

public class DocumentFactory {

    public Document getDocument(String typeDocument) {
        Document d;

        if (typeDocument.equalsIgnoreCase("Livre")) {
            d = fabriqueLivre();
        } else if (typeDocument.equalsIgnoreCase("Roman")) {
            d = fabriqueRoman();
        } else if (typeDocument.equalsIgnoreCase("Revue")) {
            d = fabriqueRevue();
        } else {
            d = null;
        }
        return d;
    }

    private Livre fabriqueLivre() {
        int numero = Saisie.lireEntier("Donnez le numéro du document");
        String isbn = Saisie.lireChaine("Donnez l'ISBN");
        String titre = Saisie.lireChaine("Titre ?");
        String auteur = Saisie.lireChaine("Auteur ?");
        int nbPages = Saisie.lireEntier("Nombre de pages ?");
        return new Livre(numero, isbn, titre, auteur, nbPages);
    }

    private Roman fabriqueRoman() {
        // TO DO
    }

    private Revue fabriqueRevue() {
        // TO DO
    }
}
