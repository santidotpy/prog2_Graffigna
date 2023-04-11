package paquete5;

public class Pentagono implements FiguraGeometrica {
    protected double lado;
    protected double apotema;
    protected double posX;
    protected double posY;

    public Pentagono(double l, double a, double x, double y) {
        try {
            if (l <= 0 || a <= 0 || x <= 0 || y <= 0) {
                throw new Exception("El lado o la pos debe ser mayor a 0");
            }
            lado = l;
            apotema = a;
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
        }    }

    public void setApotema(double a) {
        try {
            if (a <= 0) {
                throw new Exception("El apotema debe ser mayor a 0");
            }
            apotema = a;
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
        return lado * 5;
    }

    public double calcularSuperficie() {
        return (calcularPerimetro() * apotema) / 2;
    }

}
