package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 39 Escribe un programa que pida un número entero positivo por
 * teclado y que muestre a continuación los números desde el 1 al número
 * introducido junto con su factorial. Ejemplo: Por favor, introduzca un número
 * entero positivo: 7 1! = 1 2! = 2 3! = 6 4! = 24 5! = 120 6! = 720 7! = 5040
 *
 * @author angelaruiz
 */
public class Bucles39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int numero = sc.nextInt();
        sc.close();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                long factorial = 1; // Reiniciar el factorial en cada iteración
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                System.out.printf("%d! = %d%n", i, factorial);
            }
        } else {
            System.out.println("Por favor, ingrese un número entero positivo.");
        }
    }
}
