package bucles;

import java.util.Scanner;

/**
 * Ejercicio 55 Realiza un programa que sea capaz de desplazar todos los dígitos
 * de un número de izquierda a derecha una posición. El dígito de más a la
 * derecha, pasaría a dar la vuelta y se colocaría a la izquierda. Si el número
 * tiene un solo dígito, se queda igual. Ejemplo 1: Introduzca un número: 609831
 * El número resultado es 160983 Ejemplo 2: Introduzca un número: 78201345 El
 * número resultado es 57820134
 *
 * @author angelaruiz
 */
public class Bucles55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int numeroIntroducido = sc.nextInt();
        sc.close();

        int numero = numeroIntroducido;

        int divisor = 1;

        // Calcular el divisor
        while (numero > 10) {
            numero /= 10;
            divisor *= 10;

        }

        // Restaurar el valor original de numero
        numero = numeroIntroducido;

        // Obtener el último dígito y el restante
        int digitoUltimo = numero % 10;
        int restante = numero / 10;

        // Calcular el número final
        int numeroFinal = digitoUltimo * divisor + restante;

        System.out.println("El número resultado es " + numeroFinal);
    }
}
