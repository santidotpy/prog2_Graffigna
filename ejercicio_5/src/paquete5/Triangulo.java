package paquete5;

public class Triangulo implements FiguraGeometrica {
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double posX;
    protected double posY;

    public Triangulo(double l1, double l2, double l3, double x, double y) {
        try {
            if (l1 <= 0 || l2 <= 0 || l3 <= 0 || x <= 0 || y <= 0) {
                throw new Exception("El lado o la pos. debe ser mayor a 0");
            }
            lado1 = l1;
            lado2 = l2;
            lado3 = l3;
            posX = x;
            posY = y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // setters

    public void setLado1(double l) {
        try {
            if (l <= 0) {
                throw new Exception("El lado 1 debe ser mayor a 0");
            }
            lado1 = l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setLado2(double l) {
        try {
            if (l <= 0) {
                throw new Exception("El lado 2 debe ser mayor a 0");
            }
            lado2 = l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setLado3(double l) {
        try {
            if (l <= 0) {
                throw new Exception("El lado 3 debe ser mayor a 0");
            }
            lado3 = l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setPosX(double x) {
        try {
            if (x <= 0) {
                throw new Exception("La posX debe ser mayor a 0");
            }
            posX = x;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setPosY(double y) {
        try {
            if (y <= 0) {
                throw new Exception("La posY debe ser mayor a 0");
            }
            posY = y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
