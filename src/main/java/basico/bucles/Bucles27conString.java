package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 27
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author angelaruiz
 */
public class Bucles27conString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int numero = sc.nextInt();
        sc.close();

        int contador = 0;
        int suma = 0;

        // Almacena los múltiplos de 3 en una cadena
        StringBuilder multiplosDe3 = new StringBuilder("Múltiplos de 3: ");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                contador++;
                suma += i;
                multiplosDe3.append(i).append(" ");
            }
        }

        // Imprime los múltiplos de 3, la cantidad y la suma después del bucle
        System.out.println(multiplosDe3);
        System.out.printf("La cantidad de números múltiplos de 3 entre 1 y %d es %d y la suma de ellos es %d%n", numero,
                contador, suma);
    }
}
