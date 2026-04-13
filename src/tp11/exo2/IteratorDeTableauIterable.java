package tp11.exo2;

import java.util.Iterator;
public class IteratorDeTableauIterable<T> implements Iterator<T> {

    // Le tableau qu'on veut parcourir
    private TableauIterable<T> tableau;

    // La position actuelle (le "doigt")
    private int indice;

    // Constructeur : on lui donne le tableau à parcourir, on démarre à 0
    public IteratorDeTableauIterable(TableauIterable<T> tableau) {
        this.tableau = tableau;
        this.indice = 0;
    }

    // Est-ce qu'il reste des éléments ?
    // Oui si l'indice n'a pas encore atteint la fin du tableau
    @Override
    public boolean hasNext() {
        return indice < tableau.size();
    }

    // Retourne l'élément à la position actuelle et avance d'une case
    @Override
    public T next() {
        return tableau.get(indice++);
    }
}
