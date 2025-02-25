package arreglos.arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 3
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse
 * y viceversa.
 */
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca diez números");

        int contador = 0;
        int posicion = 1;
        int[] numero = new int[10];
        do {
            System.out.printf("Introduzca el número %d %n", posicion);
            numero[contador] = sc.nextInt();
            contador++;
            posicion++;
        } while (posicion <= 10);

        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
        sc.close();
    }
}
