package pck1;

public class A_Thread extends Thread {
    private String name;

    public A_Thread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int iteration = (int) (Math.random() * 31) + 10;
            int delay = (int) (Math.random() * 950) + 50;
            System.out.println("Este es el hilo " + name + " y esta es la iteración " + iteration);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
