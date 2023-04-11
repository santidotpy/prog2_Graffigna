package paquete2;

public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;

    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    @Override
    public int compareTo(Empleado otroEmpleado) {
        return this.apellido.compareTo(otroEmpleado.apellido);
    }
}