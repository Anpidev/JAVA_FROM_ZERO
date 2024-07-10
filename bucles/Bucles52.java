package bucles;

import java.util.Scanner;

/**
 * Ejercicio 52 Realiza un programa que sea capaz de desplazar todos los dígitos
 * de un número de derecha a izquierda una posición. El dígito de más a la
 * izquierda, pasaría a dar la vuelta y se colocaría a la derecha. Si el número
 * tiene un solo dígito, se queda igual. Ejemplo 1: Introduzca un número: 69831
 * El número resultado es 98316 Ejemplo 2: Introduzca un número: 78201345 El
 * número resultado es 82013457 Ejemplo 3: Introduzca un número: 24 El número
 * resultado es 42 Ejemplo 4: Introduzca un número: 8 El número resultado es 8
 *
 * @author angelaruiz
 */
public class Bucles52 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Introduzca un número:");
        int numeroIntroducido = scanner.nextInt();
        int copia = numeroIntroducido;
        int longitud = 0;

        while (copia > 0) {
            copia /= 10;
            longitud++;
        }

        int divisor = 1;
        for (int i = 1; i < longitud; i++) {
            divisor *= 10;
        }

        int primero = numeroIntroducido / divisor;
        int aux = primero * divisor;
        int resultado = (numeroIntroducido - aux) * 10 + primero;

        System.out.println("El número resultado es " + resultado + ".");
        scanner.close();
    }
}
