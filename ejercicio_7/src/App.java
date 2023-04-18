import paquete7.Empleado;
import paquete7.EmpleadoException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() throws EmpleadoException {
        Empleado empleado = new Empleado("Juan", "Perez", 123, 5);
        System.out.println(empleado.toString());

        String s = "nombre=Pablo, apellido=Marquez, legajo=673, aniosTrabajados=10";
        String s2 = "nombre=Steven apellido=Pierce legajo=555 aniosTrabajados=5";
        String s3 = "Nombre=Patrick apellido=Green legajo=486 ANIOSTrabajados=1";

        Empleado e = Empleado.crearDesdeString(s);
        Empleado e2 = Empleado.crearDesdeString(s2);
        Empleado e3 = Empleado.crearDesdeString(s3);

        System.out.println(e.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // Excepciones
        try {
            Empleado x1 = Empleado.crearDesdeString("nombre=John apellido=Taylor legajo=543 aniosTrabajados=0");
            System.out.println(x1.toString());
        } catch (EmpleadoException x1) {
            System.out.println("Error: " + x1.getMessage());
        }

        try {
            Empleado x4 = Empleado.crearDesdeString("nombre=Mike apellido= legajo=986 aniosTrabajados=2");
            System.out.println(x4.toString());
        } catch (Exception x4) {
            System.out.println("Error: " + x4.getMessage());
        }

    }
}
