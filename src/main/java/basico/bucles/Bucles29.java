package bucles;

import java.util.Scanner;

/**
 * Ejercicio 29 Escribe un programa que muestre por pantalla todos los números
 * enteros positivos menores a uno leído por teclado que no sean divisibles
 * entre otro también leído de igual forma.
 *
 * @author angelaruiz
 */
public class Bucles29 {

    public static void main(String[] args) {
        System.out.println("Calcularemos los números enteros positivos menores a uno leído por teclado\n que no "
                + "sean divisibles entre otro también leído de igual forma");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = sc.nextInt();
        System.out.println("Introduzca el número divisor");
        int divisor = sc.nextInt();
        sc.close();

        for (int i = 1; i < numero; i++) {
            if (i % divisor != 0) {
                System.out.println("Número no divisible: " + i);
            }
        }
    }
}
