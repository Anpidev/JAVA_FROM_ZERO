package bucles;

import java.util.Scanner;

/**
 * Ejercicio 46 Realiza un programa que pinte por pantalla un rectángulo hueco
 * hecho con asteriscos. Se debe pedir al usuario la anchura y la altura. Hay
 * que comprobar que tanto la anchura como la altura sean mayores o iguales que
 * 2, en caso contrario se debe mostrar un mensaje de error.
 *
 * @author angelaruiz
 */
public class Bucles46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la anchura y la altura
        System.out.print("Introduce la anchura del rectángulo: ");
        int anchura = scanner.nextInt();

        System.out.print("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();

        // Verificar si la anchura y la altura son mayores o iguales a 2
        if (anchura < 2 || altura < 2) {
            System.out.println("Error: La anchura y la altura deben ser mayores o iguales a 2.");
        } else {
            // Imprimir el rectángulo hueco
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= anchura; j++) {
                    // Imprimir asterisco solo en los bordes y esquinas
                    if (i == 1 || i == altura || j == 1 || j == anchura) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Cambiar de línea después de cada fila
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}
