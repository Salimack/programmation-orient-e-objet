package tp8_9;

/*
 * Intérêt de la classe DocumentFactory ::
 * si on modifie un constructeur, on ne change que cette classe.
 * Elle est aussi facilement extensible : pour ajouter un nouveau type de document,
 * il suffit d'ajouter une méthode fabrique() et un cas dans getDocument().
 */
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
        int numero = Saisie.lireEntier("Donnez le numéro du document");
        String isbn = Saisie.lireChaine("Donnez l'ISBN");
        String titre = Saisie.lireChaine("Titre ?");
        String auteur = Saisie.lireChaine("Auteur ?");
        int nbPages = Saisie.lireEntier("Nombre de pages ?");
        String prix = Saisie.lireChaine("Prix littéraire ?");
        return new Roman(numero, isbn, titre, auteur, nbPages, prix);
    }

    private Revue fabriqueRevue() {
        int numero = Saisie.lireEntier("Donnez le numéro du document");
        String titre = Saisie.lireChaine("Titre ?");
        String mois = Saisie.lireChaine("Mois de parution ?");
        int annee = Saisie.lireEntier("Année de parution ?");
        return new Revue(numero, titre, mois, annee);
    }
}
