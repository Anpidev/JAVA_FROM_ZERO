package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 65 Escribe un programa que pinte por pantalla la letra A. El
 * usuario debe introducir la altura total y la fila en la que debe aparecer el
 * palito horizontal (contando desde el vértice). La altura mínima es de 3
 * pisos. La fila donde va el palito horizontal debe ser mayor que 1 y menor que
 * la altura total. Si el usuario introduce algún dato incorrecto, el programa
 * debe mostrar un mensaje de error.
 *
 * @author angelaruiz
 */
public class Bucles65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la altura de la letra A al usuario
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        int altura = sc.nextInt();

        // Verificar que la altura sea mayor o igual a 3
        if (altura < 3) {
            System.out.println("La altura introducida no es correcta.");
        } else {
            // Solicitar la fila del palito horizontal al usuario
            System.out.print("Introduzca la fila del palito horizontal (entre 2 y " + (altura - 1) + "): ");
            int palito = sc.nextInt();

            // Verificar que la fila sea válida
            if ((palito < 2) || (palito >= altura)) {
                System.out.println("La fila introducida no es correcta.");
            } else {
                // Pintar la letra A
                int espaciosIzq = altura - 1;
                int espaciosCentro = 1;

                for (int fila = 1; fila <= altura; fila++) {
                    // Imprimir espacios en blanco a la izquierda
                    for (int i = 0; i < espaciosIzq; i++) {
                        System.out.print(" ");
                    }

                    System.out.print("*");

                    if (fila > 1) {
                        // Comprobar si es la fila del palito horizontal
                        for (int i = 0; i < espaciosCentro; i++) {
                            System.out.print((fila == palito) ? "*" : " ");
                        }

                        espaciosCentro += 2;
                        System.out.print("*");
                    }

                    System.out.println();
                    espaciosIzq--;
                }
            }
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}
