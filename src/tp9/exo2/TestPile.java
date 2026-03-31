package tp9.exo2;

/**
 * Q5 – Classe de test : capture des exceptions PileXXXXException.
 *
 * Chaque appel à empiler / depiler / afficher est entouré d'un try/catch
 * qui intercepte l'exception et affiche un message clair avec le code erreur.
 */
public class TestPile {

    public static void main(String[] args) {

        // --- Pile de taille 3 ---
        Pile p = new Pile(3);

        // Test empiler (cas normaux)
        System.out.println("=== Empilement de 3 valeurs ===");
        try {
            p.empiler(10);
            p.empiler(20);
            p.empiler(30);
        } catch (PilePleineException e) {
            System.out.println("Erreur (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }

        // Affichage
        System.out.println("\n=== Contenu de la pile ===");
        try {
            p.afficher();
        } catch (PileVideException e) {
            System.out.println("Erreur (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }

        // Test pile PLEINE : doit lever PilePleineException
        System.out.println("=== Test pile pleine ===");
        try {
            p.empiler(99);  // la pile est déjà pleine → exception !
        } catch (PilePleineException e) {
            System.out.println("Exception attrapée (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }

        // Dépilage de tous les éléments
        System.out.println("\n=== Dépilage de tous les éléments ===");
        try {
            System.out.println("Dépilé : " + p.depiler());
            System.out.println("Dépilé : " + p.depiler());
            System.out.println("Dépilé : " + p.depiler());
        } catch (PileVideException e) {
            System.out.println("Erreur (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }

        // Test pile VIDE : doit lever PileVideException
        System.out.println("\n=== Test pile vide ===");
        try {
            p.depiler();    // pile déjà vide → exception !
        } catch (PileVideException e) {
            System.out.println("Exception attrapée (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }

        // Test afficher pile vide
        System.out.println("\n=== Test afficher pile vide ===");
        try {
            p.afficher();   // pile vide → exception !
        } catch (PileVideException e) {
            System.out.println("Exception attrapée (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }

        // On peut aussi attraper la classe mère PileException pour tout gérer d'un coup
        System.out.println("\n=== Catch générique avec PileException ===");
        try {
            p.empiler(5);
            p.empiler(6);
            p.empiler(7);
            p.empiler(8);  // pleine → PilePleineException attrapée via PileException
        } catch (PileException e) {
            System.out.println("PileException attrapée (code " + e.getCodeErreur() + ") : " + e.getMessage());
        }
    }
}
