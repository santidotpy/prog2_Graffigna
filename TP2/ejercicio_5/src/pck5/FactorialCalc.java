package pck5;

import java.util.List;
import java.util.concurrent.*;

public class FactorialCalc implements Callable<Long> {
    private String nombre;
    private List<Integer> listaValores;

    public FactorialCalc(String nombre, List<Integer> listaValores) {
        this.nombre = nombre;
        this.listaValores = listaValores;
    }

    @Override
    public Long call() throws Exception {
        System.out.println("Hilo " + nombre + " procesando la lista.");
        int elementosPorProcesar = listaValores.size();

        for (int valor : listaValores) {
            System.out.println("Hilo " + nombre + " procesando la lista. Valor a calcular: " + valor);
            long resultado = calcularFactorial(valor);
            System.out.println("Hilo " + nombre + " procesando la lista. Valor a calcular: " + valor +
                    ". Resultado: " + resultado +
                    ". Quedan " + (--elementosPorProcesar) + " elementos en la lista por procesar.");

            if (resultado > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }

            Thread.sleep(5000); // espero 5 segundos antes de tomar el siguiente valor
        }

        return 0L; // no se usa
    }

    private long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}