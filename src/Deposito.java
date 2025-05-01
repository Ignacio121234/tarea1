import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void add(T item) {
        elementos.add(item);
    }

    public T get() {
        if (!elementos.isEmpty()) {
            return elementos.remove(0);
        }
        return null;
    }
}