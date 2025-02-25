package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 58 Realiza un programa que calcule la media de los dígitos que
 * contiene un número entero introducido por teclado. Ejemplo 1: Introduzca un
 * número: 609831 La media de sus dígitos es 4.5 Ejemplo 2: Introduzca un
 * número: 78201345 La media de sus dígitos es 3.75 Ejemplo 3: Introduzca un
 * número: 24 La media de sus dígitos es 3.0 Ejemplo 4: Introduzca un número: 8
 * La media de sus dígitos es 8.0
 *
 * @author angelaruiz
 */
public class Bucles58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int numeroIntroducido = sc.nextInt();

        int numero = numeroIntroducido;
        int digito = 0;
        int longitud = 0;
        int total = 0;
        double media = 0;

        while (numero > 0) {
            digito = numero % 10;
            longitud++;
            numero /= 10;
            total += digito;
        }
        media = (double) total / longitud;
        System.out.println("La media de sus dígitos es " + media);
        sc.close();
    }
}
