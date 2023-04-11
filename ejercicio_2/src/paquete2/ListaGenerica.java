package paquete2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica<T extends Comparable<T>> {
    private List<T> lista = new ArrayList<T>();

    public void addToList(T element) {
        lista.add(element);
    }

    public List<T> getList() {
        return lista;
    }

    public int getSize() {
        return lista.size();
    }

    public void addFirst(T element) {
        lista.add(0, element);
    }

    public void sortList() {
        Collections.sort(lista);
    }

    public void shuffleList() {
        Collections.shuffle(lista);
    }

    public void addToPosition(T element, int position) {
        lista.add(position, element);
    }

    public T getPosition(int position) {
        return lista.get(position);
    }

    public T getFirst() {
        return lista.get(0);
    }

    public T getLast() {
        return lista.get(lista.size() - 1);
    }

    public void removePosition(int position) {
        lista.remove(position);
    }
}
