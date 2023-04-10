import java.util.HashSet;
import java.util.Set;

import paquete.Empleado;
import paquete.EmpleadoSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        Empleado empleado = new Empleado("Juan", "Perez", 123, 5);
        Empleado empleado2 = new Empleado("Maria", "Gomez", 456, 10);
        Empleado empleado3 = new Empleado("Juan", "Perez", 123, 5);
        Empleado empleado4 = new Empleado("William", "Smith", 111, 9);
        Empleado empleado5 = new Empleado("Roman", "Riquelme", 10, 10);
        // set de empleados

        EmpleadoSet empleadoSet = new EmpleadoSet("Juan", "Perez", 123, 5);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("Maria", "Gomez", 456, 10);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Juan", "Perez", 123, 5);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("William", "Smith", 111, 9);
        EmpleadoSet empleadoSet5 = new EmpleadoSet("Roman", "Riquelme", 10, 10);

        Set<Empleado> empleados = new HashSet<>();
        Set<EmpleadoSet> empleadosSet = new HashSet<>();

        empleados.add(empleado);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);

        for (Empleado e : empleados) {
            System.out.println(e);
        }

        System.out.println("---------------------");

        empleadosSet.add(empleadoSet);
        empleadosSet.add(empleadoSet2);
        empleadosSet.add(empleadoSet3);
        empleadosSet.add(empleadoSet4);
        empleadosSet.add(empleadoSet5);

        for (EmpleadoSet e : empleadosSet) {
            System.out.println(e);
        }

    }
}
