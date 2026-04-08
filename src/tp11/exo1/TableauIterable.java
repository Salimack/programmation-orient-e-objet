package tp11.exo1;

public class TableauIterable<T> {
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
}
