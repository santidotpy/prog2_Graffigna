import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import pck4.Callable4;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> future1 = executor.submit(new Callable4(5, 1000));
        Future<String> future2 = executor.submit(new Callable4(10, 500));
        Future<String> future3 = executor.submit(new Callable4(3, 2000));
        Future<String> future4 = executor.submit(new Callable4(7, 750));

        System.out.println("Thread 1 result: " + future1.get());
        System.out.println("Thread 2 result: " + future2.get());
        System.out.println("Thread 3 result: " + future3.get());
        System.out.println("Thread 4 result: " + future4.get());

        executor.shutdown();
    }
}
