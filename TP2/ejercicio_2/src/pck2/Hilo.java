package pck2;

import java.math.BigInteger;
import java.util.List;

public class Hilo implements Runnable {
    private String name;
    private List<Integer> values;

    public Hilo(String name, List<Integer> values) {
        this.name = name;
        this.values = values;
    }

    @Override
    public void run() {
        while (!values.isEmpty()) {
            int value = values.remove(0);
            BigInteger factorial = BigInteger.valueOf(1);
            for (int i = 2; i <= value; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.printf(
                    "Hilo %s procesando la lista. Valor a calcular: %d. Resultado: %d. Quedan %d elementos en la lista por procesar.%n",
                    name, value, factorial, values.size());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
