package basico.numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 24 Escribe un programa que, dado un número introducido por teclado,
 * elija al azar uno de sus dígitos. Ejemplo 1: Por favor, introduzca un número
 * entero positivo: 406783 7 Ejemplo 2: Por favor, introduzca un número entero
 * positivo: 406783 3 Ejemplo 3: Por favor, introduzca un número entero
 * positivo: 406783 0
 *
 * @author angelaruiz
 */
public class Num24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int numeroIntroducido = sc.nextInt();
        sc.close();

        int digito = 0;
        int digitosTotales = 0;
        int numero = numeroIntroducido;

        // Contar la cantidad de dígitos en el número
        while (numero > 0) {
            numero /= 10;
            digitosTotales++;
        }

        // Generar posición aleatoria para elegir el dígito
        int posicion = (int) (Math.random() * digitosTotales);

        // Obtener el dígito en la posición aleatoria
        int temporal = numeroIntroducido;
        for (int i = 0; i < digitosTotales; i++) {
            if (i == posicion) {
                digito = temporal % 10;
                break;
            }
            temporal /= 10;
        }

        System.out.println(digito);
    }
}
