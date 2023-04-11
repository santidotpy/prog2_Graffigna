import paquete2.Empleado;
import paquete2.ListaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {

        ListaGenerica<Empleado> listaEmpleados = new ListaGenerica<Empleado>();

        // Agregar algunos empleados a la lista
        listaEmpleados.addToList(new Empleado("Nick", "Smith", 123, 5));
        listaEmpleados.addToList(new Empleado("Jim", "Johnson", 456, 2));
        listaEmpleados.addToList(new Empleado("Tim", "Turner", 789, 3));

        // Agregar un empleado al principio de la lista
        listaEmpleados.addFirst(new Empleado("Laura", "Olsen", 246, 4));

        // Ordenar la lista por apellido
        listaEmpleados.sortList();

        // Mostrar la lista de empleados ordenada por apellido
        for (Empleado empleado : listaEmpleados.getList()) {
            System.out.println(empleado.getApellido() + ", " + empleado.getNombre() + " - Legajo: "
                    + empleado.getLegajo() + " - Años trabajados: " + empleado.getAniosTrabajados());
        }

        // Remover el segundo empleado de la lista
        listaEmpleados.removePosition(1);

        // Mostrar la lista de empleados después de remover el segundo empleado
        for (Empleado empleado : listaEmpleados.getList()) {
            System.out.println(empleado.getApellido() + ", " + empleado.getNombre() + " - Legajo: "
                    + empleado.getLegajo() + " - Años trabajados: " + empleado.getAniosTrabajados());

        }
        // Obtener y mostrar el primer empleado de la lista
        Empleado primerEmpleado = listaEmpleados.getFirst();
        System.out.println("Primer empleado: " + primerEmpleado.getApellido() + ", " + primerEmpleado.getNombre());

        // Obtener y mostrar el último empleado de la lista
        Empleado ultimoEmpleado = listaEmpleados.getLast();
        System.out.println("Último empleado: " + ultimoEmpleado.getApellido() + ", " + ultimoEmpleado.getNombre());
    }
}
