package tp9.exo2;

/**
 * Q4 – Classe Pile réécrite avec gestion des exceptions utilisateur.
 *
 * Changements par rapport à la version TP5 :
 *   - empiler()  lève PilePleineException  au lieu d'afficher un message
 *   - depiler()  lève PileVideException    au lieu d'afficher un message
 *   - afficher() lève PileVideException    au lieu d'afficher un message
 *
 * Les méthodes qui peuvent lancer une exception le déclarent avec "throws".
 * C'est ainsi qu'on force l'appelant (TestPile) à les gérer.
 */
public class Pile {

    private int sommet;
    private int[] elements;

    // Constructeur
    public Pile(int taille) {
        this.sommet   = -1;
        this.elements = new int[taille];
    }

    // Vrai si la pile ne contient aucun élément
    public boolean pileVide() {
        return sommet == -1;
    }

    // Vrai si la pile est remplie jusqu'à sa capacité maximale
    public boolean pilePleine() {
        return sommet == elements.length - 1;
    }

    /**
     * Empile un entier.
     * @throws PilePleineException si la pile est déjà pleine (code -2)
     */
    public void empiler(int element) throws PilePleineException {
        if (pilePleine()) {
            throw new PilePleineException();  // on lance l'exception au lieu d'afficher
        }
        sommet++;
        elements[sommet] = element;
    }

    /**
     * Dépile et retourne l'entier au sommet.
     * @throws PileVideException si la pile est vide (code -1)
     */
    public int depiler() throws PileVideException {
        if (pileVide()) {
            throw new PileVideException();    // on lance l'exception au lieu d'afficher
        }
        int val = elements[sommet];
        sommet--;
        return val;
    }

    // Vide la pile (pas d'erreur possible)
    public void viderPile() {
        sommet = -1;
    }

    /**
     * Affiche le contenu de la pile du sommet vers la base.
     * @throws PileVideException si la pile est vide (code -1)
     */
    public void afficher() throws PileVideException {
        if (pileVide()) {
            throw new PileVideException();    // on lance l'exception au lieu d'afficher
        }
        for (int i = sommet; i >= 0; i--) {
            System.out.println("|" + elements[i] + "|");
            if (i == 0) {
                System.out.println("----");
            }
        }
        System.out.println();
    }
}
