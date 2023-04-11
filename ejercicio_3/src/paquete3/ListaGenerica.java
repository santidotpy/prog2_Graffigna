package paquete3;

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
        try {
            lista.add(position, element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public T getPosition(int position) {
        try {
            return lista.get(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
            //throw e;
        }
    }

    public T getFirst() {
        // if the list is empty, throw an exception
        try {
            return lista.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
            // throw e;
        }
    }

    public T getLast() {
        try {
            return lista.get(lista.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
            // throw e;
        }
    }

    public void removePosition(int position) {
        try {
            lista.remove(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
