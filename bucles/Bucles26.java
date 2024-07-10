package bucles;

import java.util.Scanner;

/**
 * Ejercicio 26 Realiza un programa que pida primero un número y a continuación
 * un dígito. El programa nos debe dar la posición (o posiciones) contando de
 * izquierda a derecha que ocupa ese dígito en el número introducido.
 *
 * @author angelaruiz
 */
public class Bucles26 {

    public static void main(String[] args) {
        System.out.println("Introduzca un número entero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Introduzca un dígito");
        int digito = sc.nextInt();
        sc.close();

        int posicion = -1; // Inicializar en -1 para manejar el caso en que no se encuentre el dígito
        int longitud = 0;
        int temp = numero;

        // Calcular la longitud del número
        while (temp != 0) {
            temp /= 10;
            longitud++;
        }

        // Buscar el dígito en el número
        for (int i = 0; i < longitud; i++) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito == digito) {
                posicion = i;
                break; // Termina el bucle si encuentra el dígito
            }
            numero /= 10;
        }

        if (posicion != -1) {
            System.out.println("El dígito " + digito + " se encuentra en la posición " + posicion
                    + " contando de izquierda a derecha.");
        } else {
            System.out.println("El dígito no se encuentra en el número proporcionado.");
        }
    }
}
