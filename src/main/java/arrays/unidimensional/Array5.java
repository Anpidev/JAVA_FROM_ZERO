package arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 5
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 */

public class Array5 {
    public static void main(String[] args) {
        int maximo = Integer.MIN_VALUE; // Inicializar con el valor mínimo posible
        int minimo = Integer.MAX_VALUE; // Inicializar con el valor máximo posible
        int contador = 0;
        int posicion = 1;
        int numero[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros");

        do {
            System.out.printf("Ingrese el número %d %n", posicion);
            numero[contador] = sc.nextInt();

            // Actualizar máximo y mínimo durante la entrada de números
            if (numero[contador] > maximo) {
                maximo = numero[contador];
            }

            if (numero[contador] < minimo) {
                minimo = numero[contador];
            }

            contador++;
            posicion++;
        } while (posicion <= 10);

        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i] + " ");

            // Mostrar "máximo" y "mínimo" junto al número correspondiente
            if (numero[i] == maximo) {
                System.out.print("(máximo) ");
            } else if (numero[i] == minimo) {
                System.out.print("(mínimo) ");
            }
            sc.close();
        }
    }
}