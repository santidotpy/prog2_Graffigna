package pck4;

import java.util.concurrent.Callable;

public class Callable4 implements Callable<String> {
    private int iterations;
    private int delay;

    public Callable4(int iterations, int delay) {
        this.iterations = iterations;
        this.delay = delay;
    }

    @Override
    public String call() throws Exception {
        for (int i = 1; i <= iterations; i++) {
            System.out.println("Iteration " + i);
            Thread.sleep(delay);
        }
        return "Done";
    }
}