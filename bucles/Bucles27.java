package bucles;

import java.util.Scanner;

/**
 * Ejercicio 27
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author angelaruiz
 */
public class Bucles27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int numero = sc.nextInt();
        sc.close();

        int contador = 0;
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                contador++;
                suma += i;
                System.out.printf("El número %d es múltiplo de 3%n", i);

            }

        }
        System.out.printf("La cantidad de números múltiplos de 3 entre 1 y %d es %d y la suma de ellos es %d%n", numero,
                contador, suma);
    }
}
