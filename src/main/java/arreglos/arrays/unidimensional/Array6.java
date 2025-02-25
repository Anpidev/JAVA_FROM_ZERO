package arreglos.arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 6
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el
 * contenido
 * del array.
 */
public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosIngresados = new int[15];
        int[] numerosFinal = new int[numerosIngresados.length];
        int posicion = 1;
        int contador = 0;
        System.out.println("Ingrese 15 números enteros");
        do {
            System.out.printf("Ingrese %d número %n", posicion);
            numerosIngresados[contador] = sc.nextInt();
            posicion++;
            contador++;

        } while (posicion <= 15);

        for (int i = 0; i < numerosFinal.length - 1; i++) {
            numerosFinal[i] = numerosIngresados[i + 1];

        }
        numerosFinal[numerosFinal.length - 1] = numerosIngresados[0];
        System.out.println("Array rotado:");
        for (int i = 0; i < numerosFinal.length; i++) {
            System.out.println(numerosFinal[i]);
        }

        sc.close();
    }
}
