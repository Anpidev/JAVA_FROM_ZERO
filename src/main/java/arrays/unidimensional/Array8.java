package arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 8
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */
public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mes = new int[12];

        System.out.println("TEMPERATURA MEDIA 2023");
        for (int i = 0; i < 12; i++) {
            System.out.println("Temperatura del mes " + (i + 1) + ":");
            mes[i] = sc.nextInt();
        }

        System.out.println("Diagrama de barras:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Mes " + (i + 1) + ":   ");
            for (int j = 0; j < mes[i]; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        sc.close();
    }
}