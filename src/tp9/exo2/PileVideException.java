package tp9.exo2;

/**
 * Q3 – Exception levée quand on tente de dépiler ou d'afficher une pile vide.
 * Code d'erreur : -1
 */
public class PileVideException extends PileException {

    public PileVideException() {
        super("Pile vide : impossible de dépiler ou d'afficher.", -1);
    }
}
