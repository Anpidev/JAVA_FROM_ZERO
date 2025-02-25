package swing.aprendiendo_interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Empleado {

    // Campos de clase
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaAlta;
    private double sueldo;

    // Constructores
    public Empleado(String nombre, LocalDate fechaAlta, double sueldo) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    public Empleado(String dni, String nombre, String apellidos, LocalDate fechaAlta, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    public Empleado() {}

    // Métodos
    public abstract void setIncentivo(double incentivo);

    public void imprimir() {
        //Metemos un formato para imprimir la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if(dni!=null){
        System.out.println("DNI: " + dni);}
        System.out.println("Nombre: " + nombre);
        if(apellidos!=null){
        System.out.println("Apellidos: " +  apellidos);}
        System.out.println("Año de alta: " + fechaAlta.format(formatter));
        System.out.println("Sueldo: " +  sueldo);
        System.out.println("-----------------------------------------");
    }

    // Getters y Setters
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

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
