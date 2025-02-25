package arreglos.arrays.bidimensional;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 8
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
Introduzca la posición del alfil: d5
El álfil puede moverse a las siguientes posiciones:
h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8
 */
public class Movimientoalfil {
    
        public static void main(String[] args) {
    
            // Objeto scanner para pedir la posición posteriormente
            Scanner scanner = new Scanner(System.in);

            // Pedir la posición del alfil al usuario
            String inputColumna = " ";
            int columnaAlfil = 0;
            int filaAlfil = 0;
            boolean entradaCorrecta = false;
    
            while (!entradaCorrecta) {
                try {
                    // Pedir la columna al usuario
                    System.out.println("Ingrese la posición de la columna del alfil (a-h): ");
                    inputColumna = scanner.nextLine().toLowerCase();
                    char columnaChar = inputColumna.charAt(0); // Obtener el primer carácter
                    columnaAlfil = columnaChar - 'a'; // Convertir el carácter a un valor numérico (0-7)
    
                    System.out.println("Ingrese la posición de la fila del alfil (1-8): ");
                    filaAlfil = scanner.nextInt();
    
                    if ((filaAlfil >= 1 && filaAlfil <= 8) && (columnaAlfil >= 0 && columnaAlfil <= 7)) {
                        entradaCorrecta = true;
                    } else {
                        System.out.println("Posición incorrecta");
                    }
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                }
            }
    
             // Inicializar un array bidimensional de tipo int
        int[][] tablero = new int[8][8];

        // Calcular las posiciones a las que el alfil puede saltar y marcarlas en el array
        for (int i = 1; i <= 8; i++) {
            int nuevaFila1 = filaAlfil + i;
            int nuevaFila2 = filaAlfil - i;
            int nuevaColumna1 = columnaAlfil + i;
            int nuevaColumna2 = columnaAlfil - i;

            if (nuevaFila1 <= 8 && nuevaColumna1 <= 7) {
                tablero[nuevaFila1 - 1][nuevaColumna1] = 1;
            }
            if (nuevaFila1 <= 8 && nuevaColumna2 >= 0) {
                tablero[nuevaFila1 - 1][nuevaColumna2] = 1;
            }
            if (nuevaFila2 >= 1 && nuevaColumna1 <= 7) {
                tablero[nuevaFila2 - 1][nuevaColumna1] = 1;
            }
            if (nuevaFila2 >= 1 && nuevaColumna2 >= 0) {
                tablero[nuevaFila2 - 1][nuevaColumna2] = 1;
            }
        }

        // Imprimir el resultado
        System.out.println("El álfil puede moverse a las siguientes posiciones:");
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                if (tablero[fila][columna] == 1) {
                    char letraColumna = (char) ('a' + columna);
                    int numeroFila = fila + 1;
                    System.out.print(letraColumna + "" + numeroFila + " ");
                }
            }
        }
    }
}