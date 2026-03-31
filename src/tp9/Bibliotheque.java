package tp9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp8_9.Document;
import tp8_9.Livre;

/**
 * TP9-bis – Exercice 1 : Iterators (utilisation)
 *
 * -----------------------------------------------------------------------
 * Q1 : 3 façons d'énumérer un ArrayList / tableau :
 *
 *   1) Boucle for classique avec indice :
 *        for (int i = 0; i < list.size(); i++) { list.get(i); }
 *
 *   2) Boucle for-each (enhanced for) :
 *        for (Document d : list) { ... }
 *
 *   3) Iterator explicite :
 *        Iterator<Document> it = list.iterator();
 *        while (it.hasNext()) { Document d = it.next(); }
 *
 * -----------------------------------------------------------------------
 * Q2 : Quand utiliser l'une plutôt que l'autre ?
 *
 *   - for avec indice   → quand on a besoin de la position (i) pour accéder
 *                         ou modifier un élément à un index précis.
 *
 *   - for-each          → parcours simple en lecture seule ; code plus lisible
 *                         et concis. À privilégier dès qu'on n'a pas besoin
 *                         de l'indice ni de modifier la liste.
 *
 *   - Iterator          → indispensable quand on doit SUPPRIMER des éléments
 *                         pendant le parcours (via it.remove()), sans risquer
 *                         une ConcurrentModificationException.
 *
 * -----------------------------------------------------------------------
 * Q3 : La méthode supprimer() du sujet (version semaine 6) est-elle fonctionnelle ?
 *
 *   NON, elle est BUGUÉE dans le cas général.
 *
 *   Code problématique :
 *     for(int i=0; i < documents.size(); i++){
 *         if (documents.get(i).equals(doc)){
 *             documents.remove(i);   // décale tous les éléments suivants
 *             res = true;
 *         }                          // i++ saute alors l'élément suivant !
 *     }
 *
 *   Problème : après documents.remove(i), l'élément qui était en i+1 se
 *   retrouve en i. Mais i est quand même incrémenté → on "saute" cet élément.
 *   Si le même document apparaît plusieurs fois consécutivement, certaines
 *   occurrences ne seront pas supprimées.
 *
 *   Correctifs possibles :
 *     a) Ajouter i-- après le remove (pour compenser le décalage).
 *     b) Utiliser un Iterator avec it.remove()  ← solution recommandée (Q4).
 *     c) Utiliser directement documents.remove(doc)  (ArrayList le gère).
 *
 * -----------------------------------------------------------------------
 * Q4 : Quel iterator utiliser ?
 *
 *   Un Iterator<Document> (ou ListIterator<Document>).
 *   Sa méthode it.remove() supprime l'élément courant de manière sûre pendant
 *   l'itération, sans décalage d'indice ni ConcurrentModificationException.
 *
 * -----------------------------------------------------------------------
 * Q5 : Réécriture des méthodes de la classe Bibliothèque
 *       de la façon la plus appropriée  →  voir implémentation ci-dessous.
 */
public class Bibliotheque {

    // Attributs
    private List<Document> documents;

    // Constructeur
    public Bibliotheque() {
        this.documents = new ArrayList<Document>();
    }

    // -----------------------------------------------------------------------
    // Q5 – for-each : approprié pour une lecture seule (plus lisible)
    // -----------------------------------------------------------------------
    public void afficherDocuments() {
        for (Document d : documents) {
            d.afficher();
        }
    }

    // -----------------------------------------------------------------------
    // Q5 – for-each : lecture seule, pas besoin de l'indice
    // -----------------------------------------------------------------------
    public void afficherAuteurs() {
        for (Document d : documents) {
            if (d instanceof Livre) {
                System.out.println(((Livre) d).getAuteur());
            }
        }
    }

    // -----------------------------------------------------------------------
    // Q5 – Iterator : seule façon correcte de supprimer pendant un parcours
    //      → évite le bug de décalage d'indice décrit en Q3
    // -----------------------------------------------------------------------
    public boolean supprimer(Document doc) {
        Iterator<Document> it = documents.iterator();
        while (it.hasNext()) {
            Document d = it.next();
            if (d.equals(doc)) {
                it.remove(); // suppression sûre, pas de ConcurrentModificationException
                return true;
            }
        }
        return false;
    }

    // -----------------------------------------------------------------------
    // Q5 – Pas de parcours ici ; contains() utilise equals() en interne
    // -----------------------------------------------------------------------
    public boolean ajouter(Document doc) {
        if (!documents.contains(doc)) {
            documents.add(doc);
            return true;
        }
        return false;
    }

    // -----------------------------------------------------------------------
    // Q5 – for-each : recherche simple en lecture seule
    // -----------------------------------------------------------------------
    public Document getDocumentByNumero(int numero) {
        for (Document d : documents) {
            if (d.getNumero() == numero) {
                return d;
            }
        }
        return null;
    }

    // Accès par indice (inchangé – nécessite la position)
    public Document getUnDocument(int i) {
        return documents.get(i);
    }
}
