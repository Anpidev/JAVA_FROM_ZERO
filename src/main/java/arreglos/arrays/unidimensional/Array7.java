package arreglos.arrays.unidimensional;

import java.util.Scanner;

/**
 * Ejercicio 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 */
public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeroGenerado = new int[100];
        int[] numeroCambiado = new int[100];
        for (int i = 0; i < 100; i++) {
            numeroGenerado[i] = (int) (Math.random() * 21);
        }

        System.out.println("Vamos a intercambiar valores");
        System.out.println("Ingrese un primer valor a cambiar de 0 a 20");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese un segundo valor dentro del mismo rango pero que no sea igual al anterior");
        int numero2 = sc.nextInt();

        for (int i = 0; i < numeroCambiado.length; i++) {
            numeroCambiado[i] = numeroGenerado[i];

            if (numeroCambiado[i] == numero1) {
                numeroCambiado[i] = numero2;
                System.out.print("'" + numeroCambiado[i] + "'");
            } else {
                System.out.print(numeroCambiado[i] + " ");
            }
        }

        sc.close();
    }
}
