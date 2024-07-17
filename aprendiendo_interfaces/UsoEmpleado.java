package aprendiendo_interfaces;

import java.time.LocalDate;
// Importa la clase Arrays
import java.util.Arrays;

public class UsoEmpleado {
    public static void main(String[] args) {
        // Crear una fecha específica usando LocalDate
        LocalDate fechaAlta = LocalDate.of(2000, 7, 17); // Año 2000, Julio 17
        
        // Crear instancias de la subclase concreta Jefes
        Jefes[] empleados = new Jefes[5];
        empleados[0] = new Jefes("María", fechaAlta, 2500);
        empleados[1] = new Jefes("Antonio", fechaAlta, 1500);
        empleados[2] = new Jefes("Juan", fechaAlta, 3500);
        empleados[3] = new Jefes("Marta", fechaAlta, 3400);
        empleados[4] = new Jefes("Sebastian", fechaAlta, 2560);

        // Imprimir información de todos los empleados antes de ordenar
        System.out.println("Empleados sin ordenar:");
        for (Jefes empleado : empleados) {
            empleado.imprimir();
        }

        // Ordenar empleados por sueldo usando Arrays.sort()
        Arrays.sort(empleados);

        // Imprimir información de todos los empleados después de ordenar
        System.out.println("Empleados ordenados por sueldo:");
        for (Jefes empleado : empleados) {
            empleado.imprimir();
        }
    }
}
