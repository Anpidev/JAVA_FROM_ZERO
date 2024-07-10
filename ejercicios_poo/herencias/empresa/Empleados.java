package ejercicios_poo.herencias.empresa;

import java.util.GregorianCalendar;

public class Empleados {
    
        // CONSTRUCTOR
        public Empleados(String nombre,double sueldo, int year, int mes, int dia) {
            this.nombre = nombre;
            this.sueldo=sueldo;
            calendario= new GregorianCalendar(year,mes,dia);
            
            id=idSiguiente;
            idSiguiente++;
        }

        
        // COMPORTAMIENTOS
        // METODO SETTER
        public void setSubeSalario(double porcentaje){
            double aumento=sueldo*porcentaje/100;
            sueldo+=aumento;
        }
       
    
        // METODO GETTER
        public String getDatosEmpleado() {
            return "El empleado " + nombre + "  su ID es "+id;
        }
        public double getSueldo(){
            return sueldo;
        }
        public GregorianCalendar getFechaAlta(){
            return calendario;
        }
    
        public static String getIdSiguiente(){ //Al ser static puede acceder al campo de clase static
            return "El ID del siguiente empleado será: "+idSiguiente;
        }
    
        // CAMPOS DE CLASE (PROPIEDADES)
        private final String nombre; //Constante (no tiene sentido poder cambiar el nombre durante la ejecucion del programa)
        private double sueldo;
        GregorianCalendar calendario;
        private int id;
        private static int idSiguiente=1; //Al ser static no pertenece a ninguna instancia de clase, ni se puede copiar, solo pertenece a la
        //clase Empleados.
    }
    

