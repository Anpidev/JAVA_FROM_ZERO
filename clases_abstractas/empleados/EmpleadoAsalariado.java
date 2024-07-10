package clases_abstractas.empleados;

import java.util.Calendar;

public class EmpleadoAsalariado extends Empleado {

    private double salarioBase;
    private double porcentajeAntiguedad;

    // Constructor con parámetros
    public EmpleadoAsalariado(String dni, String nombre, String apellidos, int anyoAlta, double salarioBase) {
        super(dni, nombre, apellidos, anyoAlta);
        this.salarioBase = salarioBase;
        this.porcentajeAntiguedad = calcularPorcentajeAntiguedad();
    }

    // Constructor por defecto
    public EmpleadoAsalariado() {
        super();
        this.salarioBase = 1000.0;
        this.porcentajeAntiguedad = 0.0;
    }

    // Método abstracto heredado de Empleado
    @Override
    public double getSalario() {
        return salarioBase + (salarioBase * porcentajeAntiguedad);
    }

    // Método privado para calcular el porcentaje de antigüedad
    private double calcularPorcentajeAntiguedad() {
        int antiguedad = Calendar.getInstance().get(Calendar.YEAR) - getAnyoAlta();
        if (antiguedad < 2) {
            return 0.0;
        } else if (antiguedad < 4) {
            return 0.07;
        } else if (antiguedad < 9) {
            return 0.11;
        } else {
            return 0.17;
        }
    }

    // Getters para los atributos salarioBase y porcentajeAntiguedad
    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPorcentajeAntiguedad() {
        return porcentajeAntiguedad;
    }

    // Setters para los atributos salarioBase y porcentajeAntiguedad
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPorcentajeAntiguedad(double porcentajeAntiguedad) {
        this.porcentajeAntiguedad = porcentajeAntiguedad;
    }
}
