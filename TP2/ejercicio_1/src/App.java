import pck1.A_Thread;
import pck1.B_Runnable;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        for (int i = 1; i <= 4; i++) {
            A_Thread thread = new A_Thread("Hilo " + i);
            thread.start();
        }

        for (int i = 1; i <= 4; i++) {
            B_Runnable runnable = new B_Runnable("Runnable " + i, 10, 200);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
