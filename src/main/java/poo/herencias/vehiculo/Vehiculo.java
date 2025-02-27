package poo.herencias.vehiculo;

public class Vehiculo {
    private static int vehiculosCreados;
    private static double kilometrosTotales;
    private double kilometrosRecorridos;
    public Vehiculo(String color, String modelo, int year) {
        vehiculosCreados++;
    }

    public void recorrer(double distancia) {
        kilometrosRecorridos += distancia;
        kilometrosTotales += distancia;
        System.out.println("Se han recorrido " + distancia + " kilómetros.");
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static double getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void mostrarInfoGlobal() {
        System.out.println("Número total de vehículos creados: " + vehiculosCreados);
        System.out.println("Total de kilómetros recorridos por todos los vehículos: " + kilometrosTotales);
    }
}