package bucles;

import java.util.Scanner;

/**
 * Ejercicio 61 Escribe un programa que pinte por pantalla la letra V. El ancho
 * del palo de la V es siempre de 3 asteriscos. El usuario debe introducir la
 * altura. La altura mínima es de 3 pisos. Si el usuario introduce una altura
 * menor, el programa debe mostrar un mensaje de error.
 *
 * @author angelaruiz
 */
public class Bucles61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario que introduzca la altura de la letra V
        System.out.print("Introduzca la altura de la letra V (mínimo 3 pisos): ");
        int altura = sc.nextInt();

        // Validación de la altura mínima
        if (altura < 3) {
            System.out.println("Error: La altura mínima es de 3 pisos.");
        } else {
            // Pinta la letra V
            for (int i = 0; i < altura - 1; i++) {
                for (int j = 0; j < altura * 2 - 1; j++) {
                    // Condición para determinar dónde imprimir los asteriscos para formar la letra
                    // V
                    if (j == i || j == altura * 2 - 2 - i) {
                        System.out.print("***");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Salto de línea al final de cada fila
                System.out.println();
            }

            // Última línea centrada
            for (int i = 0; i < altura; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
