package arreglos.arrays.unidimensional;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 13
 * Escribe un programa que rellene un array de 100 elementos con números en-
 * teros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 */
public class Array13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int numeros[] = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 501);
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            System.out.print(numeros[i] + " ");
        }
        System.out.println(" ");
        boolean seleccionValida = false;

        while (!seleccionValida) {
            try {
                System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo):");
                int destacar = sc.nextInt();

                switch (destacar) {
                    case 1:
                        for (int i = 0; i < numeros.length; i++) {
                            if (numeros[i] == minimo) {
                                System.out.printf("**%d**%n", numeros[i]);
                            } else {
                                System.out.print(numeros[i] + " ");
                            }
                        }
                        System.out.println(" ");
                        seleccionValida = true;
                        break;
                    case 2:
                        for (int i = 0; i < numeros.length; i++) {
                            if (numeros[i] == maximo) {
                                System.out.printf("**%d**%n", numeros[i]);
                            } else {
                                System.out.print(numeros[i] + " ");
                            }
                        }
                        System.out.println(" ");
                        seleccionValida = true;
                        break;
                    default:
                        System.out.println("Selección no válida");
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Debe seleccionar 1 o 2.");
                sc.next(); // Limpiar el búfer del scanner
            }
        }
        sc.close();
    }
}