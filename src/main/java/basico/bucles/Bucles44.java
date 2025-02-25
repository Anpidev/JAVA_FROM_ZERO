package bucles;

import java.util.Scanner;

/**
 * Ejercicio 44 Escribe un programa que sea capaz de insertar un dígito dentro
 * de un número indicando la posición. El nuevo dígito se colocará en la
 * posición indicada y el resto de dígitos se desplazará hacia la derecha. Las
 * posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos
 * que el usuario introduce correctamente los datos. Se recomienda usar long en
 * lugar de int ya que el primero admite números más largos. Ejemplo: Por favor,
 * introduzca un número entero positivo: 406783 Introduzca la posición donde
 * quiere insertar: 3 Introduzca el dígito que quiere insertar: 5 El número
 * resultante es 4056783.
 *
 * @author angelaruiz
 */
public class Bucles44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo:");
        long numero = sc.nextLong();

        System.out.println("Introduzca la posición donde quiere insertar:");
        int posicion = sc.nextInt();

        System.out.println("Introduzca el dígito que quiere insertar:");
        int digito = sc.nextInt();

        // Calcula la longitud del número sin usar Math.log10
        int longitud = 0;
        long temp = numero;
        while (temp != 0) {
            temp /= 10;
            longitud++;
        }

        // Calcula el factor de desplazamiento sin usar Math.pow
        long factorDesplazamiento = 1;
        for (int i = 0; i < longitud - posicion + 1; i++) {
            factorDesplazamiento *= 10;
        }

        // Inserta el dígito en la posición indicada
        long resultado = numero / factorDesplazamiento * (factorDesplazamiento * 10) + digito * factorDesplazamiento + numero % factorDesplazamiento;

        System.out.println("El número resultante es " + resultado + ".");
        sc.close();
    }
}
