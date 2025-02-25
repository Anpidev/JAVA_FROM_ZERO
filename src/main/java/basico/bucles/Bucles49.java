package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 49 Realiza un programa que calcule el máximo, el mínimo y la media
 * de una serie de números enteros positivos introducidos por teclado. El
 * programa terminará cuando el usuario introduzca un número primo. Este último
 * número no se tendrá en cuenta en los cálculos. El programa debe indicar
 * también cuántos números ha introducido el usuario (sin contar el primo que
 * sirve para salir). Ejemplo: Por favor, vaya introduciendo números enteros
 * positivos. Para terminar, introduzca un número p\ rimo: 6 8 15 12 23 Ha
 * introducido 4 números no primos. Máximo: 15 Mínimo: 6 Media: 10.25
 *
 * @author angelaruiz
 */
public class Bucles49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = false; // Variable para verificar si el número ingresado es primo
        int contador = 0; // Contador de números ingresados
        int suma = 0; // Suma de los números no primos ingresados
        int maximo = Integer.MIN_VALUE; // Valor inicial para el máximo
        int minimo = Integer.MAX_VALUE; // Valor inicial para el mínimo

        System.out.println(
                "Por favor, vaya introduciendo números enteros positivos. \nPara terminar, introduzca un número primo:");

        while (!esPrimo) {
            int numero = sc.nextInt();
            contador++;

            // Verificar si el número es primo
            if (numero > 1) {
                esPrimo = true;
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            // Actualizar valores
            if (!esPrimo) {
                suma += numero;

                // Actualizar máximo si el número actual es mayor
                if (numero > maximo) {
                    maximo = numero;
                }

                // Actualizar mínimo si el número actual es menor
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        }

        // Mostrar resultados
        System.out.println("Ha introducido " + (contador - 1) + " números no primos.");
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + (double) suma / (contador - 1));

        sc.close(); // Cerrar el Scanner después de su uso
    }
}
