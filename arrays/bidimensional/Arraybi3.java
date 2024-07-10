package arrays.bidimensional;

import java.util.Scanner;

/**
 * Ejercicio 3
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
public class Arraybi3 {

    public static void main(String[] args) {
        
        int numeros[][] = new int[4][5]; // 4 filas x 5 columnas
        int aleatorio[] = new int[20];
        int contador = 0;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaTotal = 0;
        Scanner sc = new Scanner(System.in);

        // Generar números aleatorios y llenar la matriz
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * 900 + 100);
        }

        for (int i = 0; i < 4; i++) {// fila
            for (int j = 0; j < 5; j++) {// columna
                numeros[i][j] = aleatorio[contador];
                contador++;
            }
        }

        // Mostrar la matriz y calcular sumas parciales de filas
        for (int i = 0; i < 4; i++) {// fila
            for (int j = 0; j < 5; j++) {// columna
                System.out.printf("%-8d", numeros[i][j]);
                sumaFila += numeros[i][j];
            }
            System.out.printf("| Suma Fila %-2d: %-8d\n", i, sumaFila);
            sumaTotal += sumaFila; // Sumar la suma de la fila a la suma total
            sumaFila = 0; // Reiniciar la suma para la siguiente fila
        }

        // Mostrar las sumas parciales de las columnas
        System.out.println("------------------------------------");
        for (int j = 0; j < 5; j++) {// columna
            for (int i = 0; i < 4; i++) {// fila
                sumaColumna += numeros[i][j];
            }
            System.out.printf("Suma Col %-2d: %-8d", j, sumaColumna);
            sumaTotal += sumaColumna; // Sumar la suma de la columna a la suma total
            sumaColumna = 0; // Reiniciar la suma para la siguiente columna
        }
        System.out.println();

        // Suma Total
        System.out.println("------------------------------------");
        System.out.printf("Suma Total: %-8d\n", sumaTotal);
    }
}