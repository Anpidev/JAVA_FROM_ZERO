package poo.clases_abstractas.empleado;

public class EmpleadoComision extends Empleado {
    // Constructores

    public EmpleadoComision(String dni, String nombre, String apellidos, int anioAlta, int numeroClientes,
            double comision) {
        super(dni, nombre, apellidos, anioAlta);
        this.numeroClientes = numeroClientes;
        this.comision = comision;
        this.sueldoBase = 750;
    }

    public EmpleadoComision() {
        this.sueldoBase = 750;
    }

    // Getter and setter

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // Metodo para salario

    @Override
    public double getSalario() {
        if (numeroClientes*comision>sueldoBase) {
            return numeroClientes*comision;
        }else {
            return sueldoBase;
        }
       
    }

    // Campos de clase
    private int numeroClientes;
    private double comision;
    private int sueldoBase;
}
