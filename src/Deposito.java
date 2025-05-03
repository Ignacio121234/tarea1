import java.util.ArrayList;
/**
 * CLase deposito represneta los depositos en los que se almacenan los productos
 * utliza una arraylist para almacenar
 *
 *
 *
 */
class Deposito<T> {
    private ArrayList<T> elementos = new ArrayList<>();



    //se usa para agregar elementos al deposito
    public void add(T item) {
        elementos.add(item);
    }
    //se usa para sacar los elementos del deposito
    public T get() {
        if (!elementos.isEmpty()) {
            return elementos.remove(0);
        }
        return null;
    }
}