package poo.clases.vehiculo;

public class UsoVehiculos {
    public static void main(String[] args) {

        // Creacion de primera instancia de clase Vehiculo
        Vehiculos miCoche = new Vehiculos(); // llamada al constructor
        miCoche.setColor("verde");
        /*
         * miCoche.setColor(); Cambiamos el color de "sin color" del constructor a
         * "azul"
         */
        System.out.println(miCoche.getColor());

        //Segunda estancia de clase vehiculo es decir segundo objeto
        Vehiculos miCoche2= new Vehiculos();
        miCoche2.setColor("rojo");
        System.out.println(miCoche2.getColor());

        //Tercera estancia con paso de parametros
        Vehiculos miMoto1= new Vehiculos(2);

        System.out.println(miCoche.getDatosVehiculo());
        System.out.println(miMoto1.getDatosVehiculo());

    }
}
