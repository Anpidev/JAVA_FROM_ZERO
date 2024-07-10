package ejercicios_poo.herencias.empresa;

public class Jefe extends Empleados{

    public Jefe(String nombre, double sueldo, int year, int mes, int dia) {
        super(nombre, sueldo, year, mes, dia);
        
    }

    public void setIncentivo(double cantidad){
        incentivo=cantidad;
    }

    public double getSueldo(){ //Sobrescribe el metodo getSueldo de Empleados.
        double sueldoJefe=super.getSueldo(); //Llamando al metodo getSueldo desde clase padre.
        return sueldoJefe+incentivo;
    }

    private double incentivo;

}
