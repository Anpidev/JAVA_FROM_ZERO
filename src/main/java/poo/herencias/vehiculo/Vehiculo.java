package ejercicios_poo.herencias.vehiculo;

public class Vehiculo {
    private static int vehiculosCreados;
    private static double kilometrosTotales;
    private double kilometrosRecorridos;
    private String color;
    private String modelo;
    private int year;

    public Vehiculo(String color, String modelo, int year) {
        this.color = color;
        this.modelo = modelo;
        this.year = year;
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