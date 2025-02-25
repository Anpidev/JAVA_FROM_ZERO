package basico.bucles;

import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author angelaruiz
 */
public class Bucles56 {

    public static void main(String[] args) {
        System.out.println("Triángulo relleno");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la figura");
        int altura = sc.nextInt();
        sc.close();

        int espacios = 0;

        for (int i = 0; i < altura; i++) { // Bucle externo para iterar a través de cada línea del triángulo
            for (int j = 0; j < espacios; j++) { // Bucle interno para imprimir los espacios antes de los asteriscos
                System.out.print(" ");
            }

            for (int j = 0; j < altura - i; j++) { // Bucle interno para imprimir los asteriscos
                System.out.print("*");
            }

            System.out.println();

            espacios++;
        }
    }

}
