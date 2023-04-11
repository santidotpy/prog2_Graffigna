package paquete4;

public class Pentagono implements FiguraGeometrica {
    protected double lado;
    protected double apotema;

    public Pentagono(double l, double a) {
        lado = l;
        apotema = a;
    }

    public double calcularPerimetro() {
        return lado * 5;
    }

    public double calcularSuperficie() {
        return (calcularPerimetro() * apotema) / 2;
    }

}
