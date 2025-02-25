package basico.bucles;

import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author angelaruiz
 */
public class Bucles57 {

    public static void main(String[] args) {
        // Paso 1: Imprimir un mensaje y solicitar la entrada del usuario para la altura
        System.out.println("Triángulo hueco");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la figura");
        int altura = sc.nextInt();
        sc.close(); // Cerrar el Scanner después de obtener la entrada del usuario

        // Paso 2: Imprimir la primera línea del triángulo
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Paso 3: Parte intermedia del triángulo
        int espacios = 1;
        for (int i = 1; i < altura - 1; i++) {
            // Imprimir espacios antes del primer asterisco
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Imprimir primer asterisco
            System.out.print("*");

            // Imprimir espacios en el interior del triángulo
            for (int j = 0; j < altura - i - 2; j++) {
                System.out.print(" ");
            }

            // Imprimir segundo asterisco y cambiar de línea
            System.out.println("*");

            // Incrementar la cantidad de espacios para la próxima iteración
            espacios++;
        }

        // Paso 4: Imprimir la línea del vértice inferior del triángulo
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
