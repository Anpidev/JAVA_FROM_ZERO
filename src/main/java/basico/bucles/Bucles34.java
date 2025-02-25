package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 34 Escribe un programa que pida dos números por teclado y que luego
 * mezcle en dos números diferentes los dígitos pares y los impares. Se van
 * comprobando los dígitos de la siguiente manera: primer dígito del primer
 * número, primer dígito del segundo número, segundo dígito del primer número,
 * segundo dígito del segundo número, tercer dígito del primer número... Para
 * facilitar el ejercicio, podemos suponer que el usuario introducirá dos
 * números de la misma longitud y que siempre habrá al menos un dígito par y uno
 * impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos. Ejemplo 1: Por favor, introduzca un número: 9402 Introduzca otro
 * número: 6782 El número formado por los dígitos pares es 640822 El número
 * formado por los dígitos impares es 97
 *
 * @author angelaruiz
 */
public class Bucles34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a introducir dos números por teclado (misma longitud)"
                + " y crear dos números nuevos con los dígitos pares y los impares.");
        System.out.println("Introduzca primer número:");
        long num1 = sc.nextLong();
        System.out.println("Introduzca segundo número:");
        long num2 = sc.nextLong();
        sc.close();

        long numPares = 0;
        long numImpares = 0;
        long tempPares = 0;
        long tempImpares = 0;

        while (num1 > 0 && num2 > 0) {
            long digito1 = num1 % 10;
            long digito2 = num2 % 10;

            if (digito1 % 2 == 0) {
                tempPares = tempPares * 10 + digito1;
            } else {
                tempImpares = tempImpares * 10 + digito1;
            }

            if (digito2 % 2 == 0) {
                tempPares = tempPares * 10 + digito2;
            } else {
                tempImpares = tempImpares * 10 + digito2;
            }

            num1 /= 10;
            num2 /= 10;
        }

        // Invertir los números resultantes para que estén en el orden correcto
        while (tempPares > 0) {
            numPares = numPares * 10 + tempPares % 10;
            tempPares /= 10;
        }

        while (tempImpares > 0) {
            numImpares = numImpares * 10 + tempImpares % 10;
            tempImpares /= 10;
        }

        System.out.println("El número formado por los dígitos pares es " + numPares);
        System.out.println("El número formado por los dígitos impares es " + numImpares);
    }
}
