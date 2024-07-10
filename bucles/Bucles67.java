package bucles;

import java.util.Scanner;

/**
 * Ejercicio 67 Realiza un programa que pinte una escalera que va descendiendo
 * de izquierda a derecha. El programa pedirá el número de escalones y la altura
 * de cada escalón. La anchura de los escalones siempre es la misma: 4
 * asteriscos. Introduzca el número de escalones: 4 Introduzca la altura de cada
 * escalón: 2
 *
 *** *** ******* ******* *********** *********** ***************
 * *************** @author angelaruiz
 */
public class Bucles67 {

    public static void main(String[] args) {

        // PEDIR DATOS POR PANTALLA
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de escalones");
        int escalones = sc.nextInt();
        System.out.println("Introduzca la altura de cada escalón");
        int altura = sc.nextInt();

        // EJECUCIÓN
        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j <= altura; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("****");
                }
                System.out.println(); // Salto de línea después de cada escalón
            }
        }

        // CIERRE DE OBJETO SCANNER PARA OPTIMIZAR RECURSOS
        sc.close();
    }
}
