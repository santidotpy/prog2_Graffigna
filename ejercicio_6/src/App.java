import java.util.List;
import java.util.Map;

import paquete6.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");
        App app = new App();
        app.ejecutar();
    }

    public void ejecutar() {
        Empleado empleado = new Empleado("Juan", "Perez", 123, 5);
        Empleado empleado2 = new Empleado("Maria", "Gomez", 456, 10);
        Empleado empleado3 = new Empleado("Nick", "Nielsen", 888, 4);
        Empleado empleado4 = new Empleado("William", "Smith", 111, 9);
        Empleado empleado5 = new Empleado("Roman", "Riquelme", 10, 10);

        List<Empleado> listaEmpleados = List.of(empleado, empleado2, empleado3, empleado4, empleado5);

        Map<String, Empleado> mapaEmpleados = Map.of(
                empleado.getApellido() + ", " + empleado.getNombre(), empleado,
                empleado2.getApellido() + ", " + empleado2.getNombre(), empleado2,
                empleado3.getApellido() + ", " + empleado3.getNombre(), empleado3,
                empleado4.getApellido() + ", " + empleado4.getNombre(), empleado4,
                empleado5.getApellido() + ", " + empleado5.getNombre(), empleado5);

        System.out.println("Lista de empleados: ");
        listaEmpleados.forEach(System.out::println);

        System.out.println("-------------------------");

        System.out.println("Mapa de empleados: ");
        mapaEmpleados.forEach((k, v) -> System.out.println(k + " => " + v));

    }
}
