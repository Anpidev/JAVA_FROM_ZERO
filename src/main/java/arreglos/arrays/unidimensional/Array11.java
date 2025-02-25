package arreglos.arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 11
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el
 * array resultante.
 */
public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[10];
        int i;
        int primo[] = new int[10];
        int primos = 0;
        int noPrimo[] = new int[10];
        int noPrimos = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero");
            int entero = sc.nextInt();
            numero[i] = entero;

            boolean esPrimo = true;
            for (int j = 2; j < entero; j++) {
                if (entero % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                primo[primos++] = numero[i];
            } else {
                noPrimo[noPrimos++] = numero[i];
            }
        }
       
        for (i = 0; i < 10; i++)

        {
            System.out.println("----------");
            System.out.print("|" + i + ":");
            System.out.printf("%6d|%n", numero[i]);
            System.out.println("----------");
        }

        for (i = 0; i < primos; i++) {
            numero[i] = primo[i];
        }

        for (i = primos; i < 10; i++) {
            numero[i] = noPrimo[i - primos];
        }

        for (i = 0; i < 10; i++) {
            System.out.println("----------");
            System.out.print("|" + i + ":");
            System.out.printf("%6d|%n", numero[i]);
            System.out.println("----------");
        }

        sc.close();
    }
}