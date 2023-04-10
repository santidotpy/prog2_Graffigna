package paquete;

public class EmpleadoSet extends Empleado {
    public EmpleadoSet() {
        super();
    }

    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public boolean equals(Object obj) { // esta funcion es la que se encarga de comparar los objetos y ver si son
                                        // iguales o no
        if (obj == null) {
            return false;
        }
        if (obj instanceof EmpleadoSet) {
            EmpleadoSet empleado = (EmpleadoSet) obj;
            if (this.legajo == empleado.getLegajo()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.legajo;
    }

}
