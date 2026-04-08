package tp11.exo2;

import java.util.Iterator;

public class TableauIterable<T> implements Iterable<T> {
    private T[] elements;

    public TableauIterable(T[] elements) {
        this.elements = elements;
    }

    public int size() {
        return elements.length;
    }

    public T get(int pos) {
        return elements[pos];
    }

    public void set(int pos, T value) {
        elements[pos] = value;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO
    	return new IteratorDeTableauIterable<>(this);
    }
}
