package swing.aprendiendo_interfaces.ejercicio;

public class Main {
    public static void main(String[] args) {

        // Array de objetos vehiculos
        Vehiculo[] vehiculos = new Vehiculo[5];

        // Inicialización del array con instancias de Coche y Moto
        vehiculos[0] = new Coche(50, "rojo", "Ford");
        vehiculos[1] = new Moto(150, "negro", "Suzuki");
        vehiculos[2] = new Coche(0, "blanco", "Ford");
        vehiculos[3] = new Moto(80, "rojo", "Suzuki");
        vehiculos[4] = new Moto(55, "blanco", "Suzuki");

        // Iterar sobre el array y mostrar información de cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName());
            System.out.println("Plazas: " + vehiculo.plazas());
            System.out.println(vehiculo.acelerar(15));
            System.out.println(vehiculo.frenar(5));
            System.out.println();
        }
    }
}
