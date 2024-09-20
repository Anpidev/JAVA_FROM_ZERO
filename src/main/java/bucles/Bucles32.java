package bucles;

import java.util.Scanner;

/**
 * Ejercicio 32 Escribe un programa que, dado un número entero positivo, diga
 * cuáles son y cuánto suman los dígitos pares. Los dígitos pares se deben
 * mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea
 * necesario para admitir números largos. Ejemplo 1: Por favor, introduzca un
 * número entero positivo: 94026782 Dígitos pares: 4 0 2 6 8 2 Suma de los
 * dígitos pares: 22
 *
 * @author angelaruiz
 */
public class Bucles32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero positivo
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = scanner.nextLong();

        // Inicializar variables para la suma de dígitos pares y mostrar los dígitos
        long sumaDigitosPares = 0;
        boolean hayDigitosPares = false;

        // Asegurarse de que el número sea positivo
        if (numero < 0) {
            numero = -numero; // Si es negativo, conviértelo a positivo
        } // No es necesario un bloque else, ya que no se hace nada si el número ya es
          // positivo

        // Determinar la longitud del número sin utilizar Math
        int longitud = 0;
        long tempNumero = numero;

        while (tempNumero != 0) {
            tempNumero /= 10;
            longitud++;
        }

        // Iterar sobre cada dígito del número utilizando un bucle for
        for (int i = longitud - 1; i >= 0; i--) {
            int divisor = 1;
            for (int j = 0; j < i; j++) {
                divisor *= 10;
            }

            int digito = (int) (numero / divisor) % 10; // Obtener el dígito actual

            // Verificar si el dígito es par
            if (digito % 2 == 0) {
                if (hayDigitosPares) {
                    System.out.print(" ");
                }
                System.out.print(digito); // Mostrar el dígito par
                sumaDigitosPares += digito; // Sumar el dígito par a la suma
                hayDigitosPares = true;
            }
        }

        // Mostrar la suma de los dígitos pares
        if (hayDigitosPares) {
            System.out.println("\nSuma de los dígitos pares: " + sumaDigitosPares);
        } else {
            System.out.println("\nNo hay dígitos pares en el número.");
        }
        scanner.close();
    }
}
