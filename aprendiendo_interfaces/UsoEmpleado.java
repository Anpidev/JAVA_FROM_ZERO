package aprendiendo_interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsoEmpleado {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaAlta = LocalDate.parse("10/06/2000", formatter);
        Empleado angela = new Jefes("Angela", fechaAlta, 2000);
        angela.imprimir();
    }
}
