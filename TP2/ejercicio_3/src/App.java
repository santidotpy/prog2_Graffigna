import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pck3.Consumidor;
import pck3.Productor;

public class App {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        Consumidor consumidor = new Consumidor("T1");
        consumidor.setElementosPorProcesar(lista.size());
        Thread prodThread = new Thread(new Productor(lista, consumidor));
        Thread consThread = new Thread(consumidor);
        prodThread.start();
        consThread.start();
        try {
            prodThread.join();
            consThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}