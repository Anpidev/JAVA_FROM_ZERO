package bucles;

import java.util.Scanner;

/**
 * Ejercicio 63 Realiza un programa que pinte dos pirámides rellenas hechas con
 * asteriscos, una al lado de la otra y separadas por un espacio en su base.
 *
 * @author angelaruiz
 */
public class Bucles63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la altura de la primera pirámide
        System.out.print("Introduce la altura de la primera pirámide: ");
        int alturaP1 = sc.nextInt();

        // Solicitar la altura de la segunda pirámide
        System.out.print("Introduce la altura de la segunda pirámide: ");
        int alturaP2 = sc.nextInt();

        // Determinar la altura máxima entre las dos pirámides
        int alturaMaxima = Math.max(alturaP1, alturaP2);

        // Variables para controlar la impresión de las pirámides
        int espaciosP1 = alturaP1 - 1;
        int espaciosP2 = alturaP2 - 1;
        int baseP1 = alturaP1 * 2 - 1;
        int baseP2 = alturaP2 * 2 - 1;
        int asteriscosP1 = 1;
        int asteriscosP2 = 1;

        // Bucle principal para imprimir las pirámides
        for (int i = alturaMaxima; i > 0; i--) {

            // Pirámide 1
            if (i > alturaP1) {
                // Si la pirámide 1 queda por debajo, pinta el hueco.
                for (int j = 0; j <= baseP1; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios por delante de la pirámide 1
                for (int j = 0; j < espaciosP1; j++) {
                    System.out.print(" ");
                }

                // Pirámide 1
                for (int j = 0; j < asteriscosP1; j++) {
                    System.out.print("*");
                }

                // Espacios por detrás de la pirámide 1
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP1--;
                asteriscosP1 += 2;
            }

            // Pirámide 2
            if (i > alturaP2) {
                // Si la pirámide 2 queda por debajo, pinta el hueco.
                for (int j = 0; j < baseP2; j++) {
                    System.out.print(" ");
                }
            } else {
                // Espacios por delante de la pirámide 2
                for (int j = 0; j < espaciosP2; j++) {
                    System.out.print(" ");
                }

                // Pirámide 2
                for (int j = 0; j < asteriscosP2; j++) {
                    System.out.print("*");
                }

                // Espacios por detrás de la pirámide 2
                for (int j = 0; j <= espaciosP1; j++) {
                    System.out.print(" ");
                }

                espaciosP2--;
                asteriscosP2 += 2;
            }

            // Cambiar de línea al final de cada fila
            System.out.println();
        }

        // Cerrar el Scanner
        sc.close();
    }
}
