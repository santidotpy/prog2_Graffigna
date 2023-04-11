package paquete4;

public class Triangulo implements FiguraGeometrica {
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(double l1, double l2, double l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSuperficie() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        // return (b * a) / 2;
    }

}
