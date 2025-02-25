package poo.clases_abstractas.empleado;

import java.util.GregorianCalendar;

public class EmpleadoFijo extends Empleado{

//Constructor


    public EmpleadoFijo(String dni, String nombre, String apellidos, int anioAlta, double sueldoBase) {
        super(dni, nombre, apellidos, anioAlta);
        this.sueldoBase = sueldoBase;
    }




    public EmpleadoFijo() {
        
    }

//Setter and getter 

public double getSueldoBase() {
    return sueldoBase;
}




public void setSueldoBase(double sueldoBase) {
    this.sueldoBase = sueldoBase;
}

//Metodo de getSalario
    @Override
    public double getSalario() {
        double salario=0;
          // Obtener la fecha actual
    GregorianCalendar anio = new GregorianCalendar();
    int actual = anio.get(GregorianCalendar.YEAR);

    // Calcular la cantidad de años transcurridos desde añoAlta
    int aniosActuales = actual - getAnioAlta();
    if (aniosActuales>2) {
        salario=sueldoBase;
    }
    else if (aniosActuales>=2&&aniosActuales<=3){
        salario=sueldoBase+(sueldoBase*0.07);
    }
    else if (aniosActuales>=4&& aniosActuales<=8){
        salario+=sueldoBase*0.11;
    }
    else if (aniosActuales>=9&&aniosActuales<=15) {
        salario+=sueldoBase*0.17;
    }
    return salario;}
        







    //Campos de clase
    private double sueldoBase;








  
   
}
