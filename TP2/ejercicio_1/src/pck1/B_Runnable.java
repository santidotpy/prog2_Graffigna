package pck1;

public class B_Runnable implements Runnable {
    private String name;
    private int iterations;
    private int delay;

    public B_Runnable(String name, int iterations, int delay) {
        this.name = name;
        this.iterations = iterations;
        this.delay = delay;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            int iteration = (int) (Math.random() * 31) + 10;
            System.out.println("Este es el hilo " + name + ", iteración " + iteration);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
