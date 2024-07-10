package clases_abstractas.empleados;

/**
 *
 * @author Anpiarur
 */
public class ClasesAbstractas {

       public static void main(String[] args) {

        // Crear un empleado asalariado
        EmpleadoAsalariado empleadoAsalariado1 = new EmpleadoAsalariado("12345678A", "Juan", "Pérez", 2018, 1500.0);
        System.out.println("Empleado Asalariado:");
        empleadoAsalariado1.imprimir();

        // Crear un empleado de comisión
        EmpleadoComision empleadoComision1 = new EmpleadoComision("87654321B", "Ana", "López", 2017, 900.0, 50, 35.0);
        System.out.println("\nEmpleado de Comisión:");
        empleadoComision1.imprimir();
    }
}