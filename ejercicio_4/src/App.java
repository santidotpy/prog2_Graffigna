import paquete4.Cuadrado;
import paquete4.Pentagono;
import paquete4.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        Triangulo t = new Triangulo(3, 4, 5);
        Cuadrado c = new Cuadrado(5);
        Pentagono p = new Pentagono(5, 4);

        System.out.println("Perimetro del triangulo: " + t.calcularPerimetro());
        System.out.println("Superficie del triangulo: " + t.calcularSuperficie());

        System.out.println("----------------------------------");

        System.out.println("Perimetro del cuadrado: " + c.calcularPerimetro());
        System.out.println("Superficie del cuadrado: " + c.calcularSuperficie());

        System.out.println("----------------------------------");

        System.out.println("Perimetro del pentagono: " + p.calcularPerimetro());
        System.out.println("Superficie del pentagono: " + p.calcularSuperficie());
    }
}
