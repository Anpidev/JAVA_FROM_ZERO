package bucles;

import java.util.Scanner;

/**
 * Ejercicio 43 Escribe un programa que permita partir un número introducido por
 * teclado en dos partes. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Suponemos que el usuario introduce correctamente los
 * datos, es decir, el número introducido tiene dos dígitos como mínimo y la
 * posición en la que se parte el número está entre 2 y la longitud del número.
 * No se permite en este ejercicio el uso de funciones de manejo de String (por
 * ej. para extraer subcadenas dentro de una cadena). Ejemplo: Por favor,
 * introduzca un número entero positivo: 406783 Introduzca la posición a partir
 * de la cual quiere partir el número: 5 Los números partidos son el 4067 y el
 * 83.
 *
 * @author angelaruiz
 */
public class Bucles43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo:");
        int numeroIntroducido = sc.nextInt();
        System.out.println("Introduzca la posición por la que partir el número:");
        int posicion = sc.nextInt();
        sc.close();

        int numero = numeroIntroducido;
        // Calcula la longitud del número
        int longitud = 0;
        do {
            numero /= 10;
            longitud++;
        } while (numero > 0);

        // Calcula 10 elevado a la potencia (longitud - posicion + 1)
        int potencia = 1;
        for (int i = 0; i < longitud - posicion + 1; i++) {
            potencia *= 10;
        }

        // Parte izquierda
        int parteIzquierda = numeroIntroducido / potencia;
        // Parte derecha
        int parteDerecha = numeroIntroducido % potencia;

        System.out.print("Los números partidos son el " + parteIzquierda + " y el " + parteDerecha + ".");
    }
}
