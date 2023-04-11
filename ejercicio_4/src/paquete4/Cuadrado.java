package paquete4;

public class Cuadrado implements FiguraGeometrica {
    protected double lado;

    public Cuadrado(double l) {
        lado = l;
    }

    public double calcularPerimetro() {
        return lado * 4;
    }

    public double calcularSuperficie() {
        return lado * lado;
    }

}
