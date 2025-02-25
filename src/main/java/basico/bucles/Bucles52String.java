package basico.bucles;

import java.util.Scanner;

/**
 *
 * @author angelaruiz
 */
public class Bucles52String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Introduzca un número:");
        int numero = scanner.nextInt();

        // Verificar si el número tiene más de un dígito
        if (numero >= 10) {
            // Convertir el número a cadena para facilitar la manipulación de dígitos
            String numeroStr = Integer.toString(numero);

            // Obtener el primer dígito
            char primerDigito = numeroStr.charAt(0);

            // Crear una cadena con los dígitos desplazados
            String resultadoStr = numeroStr.substring(1) + primerDigito;

            // Convertir la cadena resultante de nuevo a un número entero
            int resultado = Integer.parseInt(resultadoStr);

            // Mostrar el resultado
            System.out.println("El número resultado es " + resultado);
        } else {
            // Si el número tiene un solo dígito, mostrar el mismo número
            System.out.println("El número resultado es " + numero);
        }
        scanner.close();
    }
}
