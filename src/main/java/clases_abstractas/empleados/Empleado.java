package clases_abstractas.empleados;

public abstract class Empleado {

    //Campos de clase
    private String dni;
    private String nombre;
    private String apellidos;
    private int anyoAlta;

    //Constructores
    public Empleado(String dni, String nombre, String apellidos, int anyoAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anyoAlta = anyoAlta;
    }

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Empleado() {
    }

    ;


    //Métodos
    public abstract double getSalario();

    public void imprimir() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre y Apellidos: " + nombre + " " + apellidos);
        System.out.println("Año de alta: " + anyoAlta);
        System.out.println("Salario: " + getSalario());
        System.out.println("-----------------------------------------");
    }

// Getters:
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAnyoAlta() {
        return anyoAlta;
    }

// Setters:
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAnyoAlta(int anyoAlta) {
        this.anyoAlta = anyoAlta;
    }
}
