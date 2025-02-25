package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 42 Escribe un programa que pida un número entero positivo por
 * teclado y que muestre a continuación los 5 números consecutivos a partir del
 * número introducido. Al lado de cada número se debe indicar si se trata de un
 * primo o no. Ejemplo: Por favor, introduzca un número entero positivo: 17 17
 * es primo 18 no es primo 19 es primo 20 no es primo 21 no es primo
 *
 * @author angelaruiz
 */
public class Bucles42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número entero positivo");
            int numero = sc.nextInt();

            // Verificar si el número es positivo y entero
            if (numero > 0) {
                for (int i = numero; i <= (numero + 4); i++) {
                    // Verificar si el número es primo
                    boolean esPrimo = true;

                    if (i <= 1) {
                        esPrimo = false;
                    } else {
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }

                    // Imprimir el resultado
                    if (esPrimo) {
                        System.out.println("El número " + i + " es primo");
                    } else {
                        System.out.println("El número " + i + " no es primo");
                    }
                }
            } else {
                System.out.println("Error: Debe introducir un número entero positivo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero");
        } finally {
            sc.close();
        }
    }
}
