package clases_abstractas.empleados;

 public class EmpleadoComision extends Empleado {

    private double salarioFijo;
    private int clientesCaptados;
    private double comisionPorCliente;

    // Constructor con parámetros
    public EmpleadoComision(String dni, String nombre, String apellidos, int anyoAlta, double salarioFijo, int clientesCaptados, double comisionPorCliente) {
        super(dni, nombre, apellidos, anyoAlta);
        this.salarioFijo = salarioFijo;
        this.clientesCaptados = clientesCaptados;
        this.comisionPorCliente = comisionPorCliente;
    }

    // Constructor por defecto
    public EmpleadoComision() {
        super();
        this.salarioFijo = 950.0;
        this.clientesCaptados = 0;
        this.comisionPorCliente = 0.0;
    }

    // Método abstracto heredado de Empleado
    @Override
    public double getSalario() {
        double salarioComision = clientesCaptados * comisionPorCliente;
        return Math.max(salarioComision, salarioFijo);
    }

    // Getters para los atributos salarioFijo, clientesCaptados y comisionPorCliente
    public double getSalarioFijo() {
        return salarioFijo;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public double getComisionPorCliente() {
        return comisionPorCliente;
    }

    // Setters para los atributos salarioFijo, clientesCaptados y comisionPorCliente
    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public void setComisionPorCliente(double comisionPorCliente) {
        this.comisionPorCliente = comisionPorCliente;
    }
}
