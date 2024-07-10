package numeros_aleatorios;

/**
 * Ejercicio 19 Escribe un programa que muestre 50 números enteros aleatorios
 * comprendidos entre el -100 y el 200 ambos incluidos y separados por espacios.
 * Muestra luego el máximo de los pares el mínimo de los impares y la media de
 * todos los números generados.
 *
 * @author angelaruiz
 */
public class Num19 {

    public static void main(String[] args) {

        int maximoPares = Integer.MIN_VALUE;
        int minimoImpares = Integer.MAX_VALUE;
        int sumaTotal = 0;

        System.out.print("Números generados: ");

        for (int i = 0; i < 50; i++) {
            int numeroAleatorio = (int) (Math.random() * 301) - 100; // Rango: -100 a 200
            System.out.print(numeroAleatorio + " ");

            sumaTotal += numeroAleatorio;

            if (numeroAleatorio % 2 == 0 && numeroAleatorio > maximoPares) {
                maximoPares = numeroAleatorio;
            }

            if (numeroAleatorio % 2 != 0 && numeroAleatorio < minimoImpares) {
                minimoImpares = numeroAleatorio;
            }
        }

        System.out.println();
        System.out.println("Máximo de los pares: " + (maximoPares != Integer.MIN_VALUE ? maximoPares : "N/A"));
        System.out.println("Mínimo de los impares: " + (minimoImpares != Integer.MAX_VALUE ? minimoImpares : "N/A"));
        System.out.println("Media de todos los números: " + (double) sumaTotal / 50);
    }
}
