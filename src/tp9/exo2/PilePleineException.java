package tp9.exo2;

/**
 * Q2 – Exception levée quand on tente d'empiler sur une pile pleine.
 * Code d'erreur : -2
 */
public class PilePleineException extends PileException {

    public PilePleineException() {
        super("Pile pleine : impossible d'empiler un nouvel élément.", -2);
    }
}
