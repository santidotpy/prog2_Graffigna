package paquete7;

public class Empleado {
    protected String nombre;

    protected String apellido;

    protected int legajo;

    protected int aniosTrabajados;

    public Empleado() {

    }

    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    public static Empleado crearDesdeString(String s) throws EmpleadoException {
        String[] tokens = s.split("[, ]+"); // Separar por comas y espacios
        String nombre = null;
        String apellido = null;
        int legajo = 0;
        int aniosTrabajados = 0;
        for (String token : tokens) {
            String[] parts = token.split("=");
            if (parts.length != 2) {
                continue;
            }
            String key = parts[0].toLowerCase();
            String value = parts[1];

            switch (key) {
                case "nombre":
                    nombre = value;
                    break;
                case "apellido":
                    apellido = value;
                    break;
                case "legajo":
                    legajo = Integer.parseInt(value);
                    break;
                case "aniostrabajados":
                    try {
                        aniosTrabajados = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new EmpleadoException("aniosTrabajados debe ser un valor numérico entero.");
                    }
                    if (aniosTrabajados <= 0) {
                        throw new EmpleadoException("aniosTrabajados debe ser un valor numérico entero mayor a cero.");
                    }
                    break;
                default:
                    throw new EmpleadoException("Elemento desconocido: " + key);
            }
        }

        if (nombre == null || apellido == null || legajo == 0) {
            throw new EmpleadoException("Faltan datos obligatorios.");
        }
        return new Empleado(nombre, apellido, legajo, aniosTrabajados);

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre = '" + nombre + '\'' +
                ", Apellido = '" + apellido + '\'' +
                ", Legajo = " + legajo +
                ", Experiencia = " + aniosTrabajados +
                '}';
    }
}
