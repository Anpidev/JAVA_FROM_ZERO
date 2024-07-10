package ejercicios_poo.herencias.vehiculo;

import java.util.Scanner;

public class UsoVehiculo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta("Rojo", "Mountain Bike", 2020,5);
        Coche coche = new Coche("Negro", "SUV", 2022,180);

        bicicleta.recorrer(15.2);
        coche.recorrer(3000);


        int opcion;
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    bicicleta.andar();
                    break;
                case 2:
                    bicicleta.hacerCaballito();
                    break;
                case 3:
                    coche.andar();
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Kilometraje de la bicicleta: " + bicicleta.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println("Kilometraje del coche: " + coche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println("Kilometraje total de todos los vehículos: " + Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 8);

        Vehiculo.mostrarInfoGlobal();
    }
}

