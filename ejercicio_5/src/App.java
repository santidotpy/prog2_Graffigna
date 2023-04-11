import paquete5.Cuadrado;
import paquete5.Pentagono;
import paquete5.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        Triangulo t = new Triangulo(3, 4, 5, 3, 3);
        Cuadrado c = new Cuadrado(5, 3, 3);
        Pentagono p = new Pentagono(5, 4, 3, 3);

        System.out.println("Perimetro del triangulo: " + t.calcularPerimetro());
        System.out.println("Superficie del triangulo: " + t.calcularSuperficie());

        System.out.println("----------------------------------");

        System.out.println("Perimetro del cuadrado: " + c.calcularPerimetro());
        System.out.println("Superficie del cuadrado: " + c.calcularSuperficie());

        System.out.println("----------------------------------");

        System.out.println("Perimetro del pentagono: " + p.calcularPerimetro());
        System.out.println("Superficie del pentagono: " + p.calcularSuperficie());

        System.out.println("----------------------------------");

        // Excepciones
        System.out.println("Excepciones");
        Triangulo t2 = new Triangulo(3, 4, 5, 0, 1);
        Cuadrado c2 = new Cuadrado(5, 3, 0);
        Pentagono p2 = new Pentagono(5, 4, 0, 0);

        t2.calcularPerimetro();
        c2.calcularPerimetro();
        p2.calcularPerimetro();

        t.setPosX(0);
        c.setLado(0);
        p.setApotema(0);
    }
}
