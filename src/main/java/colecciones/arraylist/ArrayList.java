package colecciones.arraylist;

import java.util.Scanner;

/**
 * ArrayList
 * En este ejercicio se trata de crear una aplicación que pida introducir
 * números enteros por
 * consola y que los vaya almacenando en un ArrayList. Cuando se introduce el
 * número 0, el
 * programa deja de pedir números e imprime en consola 3 cálculos:
 * La suma de los números introducidos
 * La media de los números introducidos
 * Cuántos números se han introducido que son superiores a la media.
 */
public class ArrayList {

    public static void main(String[] args) {
        // Instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        // Instancia de la clase ArrayList
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();

        // Variables
        int valor;
        int contador = 0;
        int suma = 0;

        // Petición de números
        System.out.println("Ingrese un número, si introduce cero el programa terminará");
        do {
            System.out.println("Introduzca el número a almacenar");
            valor = sc.nextInt();
            if (valor != 0) {
                numeros.add(valor);
                contador++;
                suma += valor;

            } else {
                System.out.println("Terminando el programa...");
            }
        } while (valor != 0);

        // calculo de la media
        double media = (double) suma / contador;

        // resultados
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("La media de los números introducidos es: " + media);
        System.out.println("Se han introducido " + contador + " números.");
        sc.close();
    }
     
}