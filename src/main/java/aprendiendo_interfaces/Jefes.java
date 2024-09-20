package aprendiendo_interfaces;

import java.time.LocalDate;

public class Jefes extends Empleado implements ParaJefes, Comparable <Jefes>{

    // Campos de clase
    private double incentivo;
    private String cargo;

    public Jefes(String nombre, LocalDate fechaAlta, double sueldo) {
        super(nombre, fechaAlta, sueldo);
    }

    // Implementación de método abstracto
    @Override
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    // Implementación de todos los métodos de la interfaz
    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getCargo() {
        return "\n Además tiene el cargo de " + cargo;
    }

    @Override
    
        public int compareTo(Jefes otroJefe) {
            // Comparar por sueldo
            return Double.compare(this.getSueldo(), otroJefe.getSueldo());
        }

    
}
