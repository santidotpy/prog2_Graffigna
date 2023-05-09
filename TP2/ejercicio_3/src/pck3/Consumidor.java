package pck3;

import java.math.BigInteger;

public class Consumidor implements Runnable {
    private String name;
    private int elementosPorProcesar;

    public Consumidor(String name) {
        this.name = name;
    }

    public void procesar(Integer valor) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= valor; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        elementosPorProcesar--;
        System.out.println("Hilo " + name + " procesando la lista. Valor a calcular: " + valor + ". Resultado: "
                + result + ". Quedan " + elementosPorProcesar + " elementos en la lista por procesar.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setElementosPorProcesar(int elementosPorProcesar) {
        this.elementosPorProcesar = elementosPorProcesar;
    }

    public void run() {
        // espero recibir valores
    }
}