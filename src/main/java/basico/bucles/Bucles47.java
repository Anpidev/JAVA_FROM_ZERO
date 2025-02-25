package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 47 Con motivo de la celebración del día de la mujer, el 8 de marzo,
 * nos han encargado realizar un programa que pinte un 8 por pantalla usando la
 * letra M. Se pide al usuario la altura, que debe ser un número entero impar
 * mayor o igual que 5. Si el número introducido no es correcto, el programa
 * deberá mostrar un mensaje de error.
 *
 * @author angelaruiz
 */
public class Bucles47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Día de la mujer");
        System.out.println("Vamos a pintar un 8 con la letra M");
        System.out.println("Introduzca la altura del 8 (debe ser un número entero impar y mayor o igual que cinco)");

        int altura = scanner.nextInt();

        if (altura % 2 != 0 && altura >= 5) {
            // Parte superior del 8
            System.out.println("MMMMMM");

            // Parte central del 8
            int alturaAux = (altura - 3) / 2;
            for (int i = 0; i < alturaAux; i++) {
                System.out.println("M    M");
            }

            // Parte inferior del 8
            System.out.println("MMMMMM");

            // Segunda parte central del 8
            for (int i = 0; i < alturaAux; i++) {
                System.out.println("M    M");
            }

            // Parte inferior del 8
            System.out.println("MMMMMM");
        } else {
            System.out.println("Error: La altura debe ser un número entero impar mayor o igual que cinco.");
        }

        scanner.close();
    }
}
