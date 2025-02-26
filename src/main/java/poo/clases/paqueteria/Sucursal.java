package poo.clases.paqueteria;

/*Clase 1: Clase Sucursal. Encargada de construir objetos de tipo Sucursal con las
siguientes características:
o Propiedades:
▪ Número de sucursal
▪ Dirección
▪ Ciudad
o Constructor:
▪ Encargado de establecer la dirección, ciudad y no de sucursal
o Métodos:
▪ 3 getters para obtener no de sucursal, dirección y ciudad
▪ Método setter que calcula precio. Este método recibe por parámetro
un objeto de tipo Paquete y calcula el precio del envío del paquete en
función del peso del mismo y la prioridad del envío (0, 1 o 2 siendo estos
0=normal, 1=Alta y 2=Urgente). Prioridad 0 el precio no se altera.
Prioridad 1 el precio se incremente 10 €. Prioridad 2 el precio se
incrementa 20 €. */
public class Sucursal {

    public Sucursal(int numeroSucursal,String direccion,String ciudad){
        this.numeroSucursal=numeroSucursal;
        this.direccion=direccion;
        this.ciudad=ciudad;
    }

    public int getNumeroSucursal(){
        return numeroSucursal;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getCiudad(){
        return ciudad;
    }

    public double precio(Paquete paquete) {
        double precio = paquete.getPeso();
        int prioridad = paquete.getPrioridad();
    
        if (prioridad == 1) {
            precio += 10;
        } else if (prioridad == 2) {
            precio += 20;
        }
    
        return precio;
    }



    private int numeroSucursal;
    private String direccion;
    private String ciudad;
}
