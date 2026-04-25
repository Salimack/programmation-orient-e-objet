package tp11.exo3;

import java.util.Vector;

public class ListeDePoints<T extends Number> extends Vector<PointBis<T>> {

    public void ajoutPoint(PointBis<T> p) {
        // add() est hérité de Vector, il ajoute p à la fin de la liste
        add(p);
    }

    public void retirerPoint(PointBis<T> p) {
        // remove() est hérité de Vector, il supprime p de la liste
        remove(p);
    }

    public boolean estDsListe(PointBis<T> p) {
        // contains() est hérité de Vector, il retourne true si p est dans la liste
        return contains(p);
    }

    public PointBis<T> getPoint(int pos) {
        // get() est hérité de Vector, il retourne l'élément à la position pos
        return get(pos);
    }

    public void afficher() {
        // on parcourt tous les éléments et on appelle afficher() sur chacun
        for (PointBis<T> p : this) {
            p.afficher();
        }
    }
}
