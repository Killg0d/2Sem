public class MyList<T> {
    Object[] elements;
    int size;

    MyList(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T a) {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = a;
    }

    @SuppressWarnings("unchecked") // Suppress unchecked cast warning
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index]; // Cast Object to T
    }

    public static void main(String[] args) {
        MyList<Integer> m = new MyList<>(5);
        m.add(10);
        System.out.println(m.get(0));
    }
}
