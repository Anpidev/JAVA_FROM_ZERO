package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 33 Realiza un programa que pinte la letra U por pantalla hecha con
 * asteriscos. El programa pedirá la altura. Fíjate que el programa inserta un
 * espacio y pinta dos asteriscos menos en la base para simular la curvatura de
 * las esquinas inferiores.
 *
 * @author angelaruiz
 */
public class Bucles33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a pintar la letra U por pantalla");
        System.out.println("Ingresa la altura de la letra");
        int altura = sc.nextInt();
        sc.close();

        int base = altura - 2;

        // Parte superior de la letra U
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < base; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Base de la letra U
        System.out.print(" ");
        for (int k = 0; k < base; k++) {
            System.out.print("*");
        }
        System.out.println(); // Nueva línea después de la base
    }
}
