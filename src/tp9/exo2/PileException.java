package tp9.exo2;

/**
 * Q1 – Classe de base pour toutes les exceptions de la Pile.
 *
 * Elle hérite de Exception (checked exception) → oblige l'appelant
 * à la gérer avec try/catch ou à la déclarer avec throws.
 *
 * Codes d'erreur utilisés :
 *   -1 → pile vide
 *   -2 → pile pleine
 */
public class PileException extends Exception {

    // Code identifiant le type d'erreur
    private int codeErreur;

    // Constructeur : message lisible + code d'erreur
    public PileException(String message, int codeErreur) {
        super(message);               // transmet le message à Exception
        this.codeErreur = codeErreur;
    }

    // Accesseur
    public int getCodeErreur() {
        return codeErreur;
    }
}
