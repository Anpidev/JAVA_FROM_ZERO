package arreglos.arrays.unidimensional;

/**
 * Ejercicio 10
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es
 * necesario.
 */
public class Array10 {
    public static void main(String[] args) {
        int numero[] = new int[20];
        int par[] = new int[20];
        int impar[] = new int[20];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            if (numero[i] % 2 == 0) {
                par[pares++] = numero[i];
            } else {
                impar[impares++] = numero[i];
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i] + " ");
        }
        for (int i = 0; i < pares; i++) {
            numero[i] = par[i];

        }

        for (int i = pares; i < 20; i++) {
            numero[i] = impar[i - pares];

        }
        System.out.println("Array con los pares al principio:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}
