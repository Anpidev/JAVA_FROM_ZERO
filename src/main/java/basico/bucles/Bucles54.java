package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 54 Realiza un programa que pinte un triángulo hueco tal como se
 * muestra en los ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author angelaruiz
 */
public class Bucles54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura del triángulo:");
        int altura = sc.nextInt();
        sc.close();

        // Primera línea
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Parte intermedia
        for (int i = 1; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < altura - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Vértice inferior
        System.out.println("*");
    }

}
