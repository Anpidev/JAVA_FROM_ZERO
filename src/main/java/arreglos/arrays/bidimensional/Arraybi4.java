package arreglos.arrays.bidimensional;
/*
 * *Ejercicio 4*  
Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.  
 */

import java.util.Scanner;

public class Arraybi4 {
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
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se produjo una interrupción durante el retardo.");
                e.printStackTrace();
            } // Retardo en milisegundos
            System.out.printf("| Suma Fila %-2d: %-8d%n", i, sumaFila);
            sumaTotal += sumaFila; // Sumar la suma de la fila a la suma total
            sumaFila = 0; // Reiniciar la suma para la siguiente fila
        }

        // Mostrar las sumas parciales de las columnas
        System.out.println("------------------------------------");
        for (int j = 0; j < 5; j++) {// columna
            for (int i = 0; i < 4; i++) {// fila
                sumaColumna += numeros[i][j];
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Se produjo una interrupción durante el retardo.");
                e.printStackTrace();
            } // Retardo en milisegundos (tiene que ir dentro de un trycatch para que tire)
            System.out.printf("Suma Col %-2d: %-8d", j, sumaColumna);
            sumaTotal += sumaColumna; // Sumar la suma de la columna a la suma total
            sumaColumna = 0; // Reiniciar la suma para la siguiente columna
        }
        System.out.println();

        // Suma Total
        System.out.println("------------------------------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Se produjo una interrupción durante el retardo.");
            e.printStackTrace();
        } // Retardo en milisegundos
        System.out.printf("Suma Total: %-8d%n", sumaTotal);
    }

}
