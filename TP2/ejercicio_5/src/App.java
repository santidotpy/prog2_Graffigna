import pck5.FactorialCalc;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() throws InterruptedException, ExecutionException {
        // lista de valores enteros
        List<Integer> valores = new ArrayList<>();
        valores.add(2);
        valores.add(10);
        valores.add(5);

        // executorService para administrar los hilos
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // lista de future para almacenar los resultados
        List<Future<Long>> resultados = new ArrayList<>();

        // creo y envio los hilos al ExecutorService
        FactorialCalc hilo = new FactorialCalc("Hilo1", valores);
        Future<Long> resultado = executor.submit(hilo);
        resultados.add(resultado);

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        // muestro los resultados
        for (Future<Long> fut : resultados) {
            long res = fut.get();
            System.out.println("Resultado del hilo: " + res);
        }
    }

}
