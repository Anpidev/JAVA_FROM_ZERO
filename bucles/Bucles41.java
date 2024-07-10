package bucles;

import java.util.Scanner;

/**
 * Ejercicio 41 Escribe un programa que diga cuántos dígitos pares y cuántos
 * dígitos impares hay dentro de un número. Se recomienda usar long en lugar de
 * int ya que el primero admite números más largos. Ejemplo 1: Por favor,
 * introduzca un número entero positivo: 406783 El 406783 contiene 4 dígitos
 * pares y 2 dígitos impares. Ejemplo 2: Por favor, introduzca un número entero
 * positivo: 3177840 El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
 *
 * @author angelaruiz
 */
public class Bucles41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos dígitos pares e impares tiene un número?");
        System.out.println("Ingrese un número entero");
        long numero = sc.nextLong();
        sc.close();

        long temp;
        int digito = 0;
        int pares = 0;
        int impares = 0;

        if (numero > 0) {
            temp = numero;

            while (temp > 0) {
                digito = (int) temp % 10;
                if (digito % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                temp /= 10;

            }
            System.out.println(
                    "El número " + numero + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares");
        }
    }
}
