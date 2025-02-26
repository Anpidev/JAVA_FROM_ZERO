package poo.clases.paqueteria;

/*Clase 2: Clase Paquete. Encargada de construir objetos de tipo Paquete con las
siguientes características:
o Propiedades:
▪ Referencia del envío
▪ Peso
▪ DNI del remitente
▪ Prioridad del envío. Esta puede ser 0, 1 y 2 (Normal, Alta, Urgente)
o Constructor:
▪ Encargado de establecer las propiedades a los valores elegidos
o Métodos:
▪ 2 setters para modificar (si se quiere) peso y prioridad
▪ 2 getters para obtener peso y prioridad. */

public class Paquete {

    public Paquete(int referencia, double peso, String dni, int prioridad) {
        this.referencia = referencia;
        this.peso = peso;
        this.dni = dni;
        this.prioridad = prioridad;
    }

    public void setPeso(double x) {
        peso = x;
    }

    public void setPrioridad(int x) {
        prioridad = x;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    private int referencia;
    private double peso;
    private String dni;
    private int prioridad;

}
