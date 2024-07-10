package bucles;

import java.util.Scanner;

/**
 * Ejercicio 36 Escribe un programa que diga si un número introducido por
 * teclado es o no capicúa. Los números capicúa se leen igual hacia delante y
 * hacia atrás. El programa debe aceptar números de cualquier longitud siempre
 * que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno.
 * Se recomienda usar long en lugar de int ya que el primero admite números más
 * largos. Ejemplo 1: Por favor, introduzca un número entero positivo: 678 El
 * 678 no es capicúa. Ejemplo 2: Por favor, introduzca un número entero
 * positivo: 2019102 El 2019102 es capicúa
 *
 * @author angelaruiz
 */
public class Bucles36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        long numero = sc.nextLong();
        sc.close();

        if (numero > 0) {
            long original = numero;
            long invertido = 0;
            long digito;

            while (numero > 0) {
                digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero /= 10;
            }

            if (original == invertido) {
                System.out.println("El número introducido " + original + " es capicúa.");
            } else {
                System.out.println("El número introducido " + original + " no es capicúa.");
            }
        } else {
            System.out.println("Número no positivo.");
        }
    }
}
