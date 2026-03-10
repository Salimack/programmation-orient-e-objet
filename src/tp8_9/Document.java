package tp8_9;

public class Document {

    // Attributs
    private int numero;
    private String titre;
    private String test123;

    // Constructeurs
    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
    }

    // Gets
    public int getNumero() {
        return numero;
    }

    public String getTitre() {
        return titre;
    }

    // Autres méthodes

    /*
     * La méthode equals vérifie si deux documents sont égaux.
     * Elle retourne true si et seulement si :
     *   1) l'objet passé en paramètre (obj) est bien une instance de Document
     *      (et non null ou d'un autre type), grâce à instanceof.
     *   2) le numéro de cet objet Document est identique au numéro du document
     *      courant (this.numero), car le numéro est l'identifiant unique d'un document.
     * En d'autres termes, deux documents sont considérés comme égaux s'ils ont le même numéro.
     */
    public boolean equals(Object obj) {
        return obj instanceof Document
                && ((Document) obj).numero == numero;
    }

    public String toString() {
        return "Document [numero=" + numero + ", titre=" + titre + "]";
    }

    public void afficher() {
        System.out.println(toString());
    }
}
