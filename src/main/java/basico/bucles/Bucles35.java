package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 35 Realiza un programa que pinte una X hecha de asteriscos. El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 * error.
 *
 * @author angelaruiz
 */
public class Bucles35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a pintar una X hecha de asteriscos");
        System.out.println("Ingrese la altura de la X (debe ser un número impar mayor o igual a 3):");
        int altura = sc.nextInt();
        sc.close();

        if (altura % 2 != 0 && altura >= 3) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    // Imprime asterisco (*) en las posiciones correspondientes para formar una X
                    if (i == j || i == altura - 1 - j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Salto de línea después de cada fila
                System.out.println();
            }
        } else {
            System.out.println("Altura errónea. Debe ser un número impar mayor o igual a 3.");
        }
    }
}
