package tp11.exo2;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        TableauIterable<String> ti = new TableauIterable<String>(jours);

        // Méthode 1 : boucle sur les indices
        System.out.println("=== Méthode 1 : indices ===");
        for (int i = 0; i < ti.size(); i++) {
            System.out.println(ti.get(i));
        }

        // Méthode 2 : for-each (itération implicite)
        System.out.println("=== Méthode 2 : for-each ===");
        for (String s : ti) {
            System.out.println(s);
        }

        // Méthode 3 : Iterator explicite
        System.out.println("=== Méthode 3 : Iterator ===");
        Iterator<String> it = ti.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
