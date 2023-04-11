package paquete5;

public class Cuadrado implements FiguraGeometrica {
    protected double lado;
    protected double posX;
    protected double posY;

    public Cuadrado(double l, double x, double y) {
        try {
            if (l <= 0 || x <= 0 || y <= 0) {
                throw new Exception("El lado o la pos debe ser mayor a 0");
            }
            lado = l;
            posX = x;
            posY = y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // setters

    public void setLado(double l) {
        try {
            if (l <= 0) {
                throw new Exception("El lado debe ser mayor a 0");
            }
            lado = l;
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
        return lado * 4;
    }

    public double calcularSuperficie() {
        return lado * lado;
    }

}
