package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 31 Realiza un programa que pinte la letra L por pantalla hecha con
 * asteriscos. El programa pedirá la altura. El palo horizontal de la L tendrá
 * una longitud de la mitad (división entera entre 2) de la altura más uno.
 * Ejemplo: Introduzca la altura de la L: 5
 *
 *
 *
 *
 * * *
 * Ejercicio
 *
 * @author angelaruiz
 */
public class Bucles31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la altura de la L: ");
        int altura = scanner.nextInt();

        // Imprime el palo vertical de la L
        for (int i = 0; i < altura; i++) {
            System.out.println("*");
        }

        // Imprime el palo horizontal de la L
        for (int i = 0; i < (altura / 2) + 1; i++) { // SE USA +1 para asegurar que siempre tenga una base
            System.out.print("* ");
        }

        // Salto de línea al final para separar la L del palo vertical
        System.out.println();
        scanner.close();
    }
}
