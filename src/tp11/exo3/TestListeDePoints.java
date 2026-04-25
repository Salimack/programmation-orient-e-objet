package tp11.exo3;

public class TestListeDePoints {

    public static void main(String[] args) {

        // Variante 1 : liste de points avec des Integer
        System.out.println("=== Liste avec Integer ===");
        ListeDePoints<Integer> listeInt = new ListeDePoints<>();
        listeInt.ajoutPoint(new PointBis<>(1, 2));
        listeInt.ajoutPoint(new PointBis<>(3, 4));
        listeInt.ajoutPoint(new PointBis<>(5, 6));
        listeInt.afficher();

        // Variante 2 : liste de points avec des Double
        System.out.println("=== Liste avec Double ===");
        ListeDePoints<Double> listeDouble = new ListeDePoints<>();
        listeDouble.ajoutPoint(new PointBis<>(1.5, 2.5));
        listeDouble.ajoutPoint(new PointBis<>(3.7, 4.2));
        listeDouble.afficher();

        // Test estDsListe
        PointBis<Integer> p = new PointBis<>(1, 2);
        listeInt.ajoutPoint(p);
        System.out.println("p est dans la liste : " + listeInt.estDsListe(p));

        // Test retirerPoint
        listeInt.retirerPoint(p);
        System.out.println("Après suppression :");
        listeInt.afficher();
    }
}
