package pck3;

import java.util.List;

public class Productor implements Runnable {
    private List<Integer> lista;
    private Consumidor consumidor;

    public Productor(List<Integer> lista, Consumidor consumidor) {
        this.lista = lista;
        this.consumidor = consumidor;
    }

    public void run() {
        while (!lista.isEmpty()) {
            Integer valor = lista.remove(0);
            consumidor.procesar(valor);
        }
    }
}
