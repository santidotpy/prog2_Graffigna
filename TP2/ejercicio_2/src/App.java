import pck2.Hilo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        List<Integer> values = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        Thread thread = new Thread(new Hilo("Hilo", values));
        thread.start();

        Thread thread1 = new Thread(new Hilo("Hilo1", values));
        Thread thread2 = new Thread(new Hilo("Hilo2", values));
        Thread thread3 = new Thread(new Hilo("Hilo3", values));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
