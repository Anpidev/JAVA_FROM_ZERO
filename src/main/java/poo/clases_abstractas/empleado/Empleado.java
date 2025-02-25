package poo.clases_abstractas.empleado;

public abstract class Empleado {

    // Constructor con parametros
    public Empleado(String dni, String nombre, String apellidos, int anioAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioAlta = anioAlta;
    }

    // Constructor por defecto
    public Empleado() {

    }

    // Getter y setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnioAlta() {
        return anioAlta;
    }

    public void setAnioAlta(int anioAlta) {
        this.anioAlta = anioAlta;
    }

    // Metodo imprimir
    public String imprimir() {
        StringBuilder imprimir = new StringBuilder();
        imprimir.append("El empleado con nombre").append(nombre);
        imprimir.append(" y apellidos ").append(apellidos);
        imprimir.append(" tiene el DNI: ").append(dni);
        imprimir.append(" y entro en la empresa en el año ").append(anioAlta).append(".");
        return imprimir.toString();
    }

    // Metodo abstracto getSalario
    public abstract double getSalario();

    // Campos de clase
    private String dni;
    private String nombre;
    private String apellidos;
    private int anioAlta;
}
