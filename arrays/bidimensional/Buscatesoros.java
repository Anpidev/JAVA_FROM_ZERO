package arrays.bidimensional;

import java.util.InputMismatchException;
import java.util.Random;
/*
 *  Minijuego "Busca el TESORO"
*
* Se colocan una MINA y un TESORO de forma aleatoria en un cuadrante de
* cuatro filas por cinco columnas. El USUARIO intentará averiguar dónde
* está el TESORO.
*
 */
import java.util.Scanner;

public class Buscatesoros {
    public static void main(String[] args) {

        // Objeto Scanner y random
        Scanner sc = new Scanner(System.in);
        Random azarFila = new Random();
        Random azarColumna = new Random();

        // Declaracion de variables
        char vacio = '*';
        char mina = '!';
        char tesoro = '$';
        int coordenadaX = 0;
        int coordenadaY = 0;

        // Definir ubicacion de tesoro
        int filaTesoro = azarFila.nextInt(4);
        int columnaTesoro = azarColumna.nextInt(5);

        // Definir ubicacion de mina
        int filaMina = azarFila.nextInt(4);
        int columnaMina = azarColumna.nextInt(5);

        // Declaracion array vacio
        char plantilla[][] = new char[4][5]; // 4 filas x 5 columnas

        // Rellenar array vacio
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                plantilla[i][j] = vacio;
            }
        }

        // Rellenar array con tesoro y mina
        plantilla[filaMina][columnaMina] = mina;
        plantilla[filaTesoro][columnaTesoro] = tesoro;

        // Imprimir la matriz vacia
        for (int i = 0; i < 4; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%s ", vacio);
            }
            System.out.println(); // Salto de línea después de imprimir cada fila
        }

        // Imprimir la línea de guiones justo debajo de la matriz
        System.out.print("   ");
        for (int j = 0; j < 5; j++) {
            System.out.print("--");
        }
        System.out.println(); // Salto de línea después de imprimir la línea

        // Imprimir las posiciones j en la parte inferior
        System.out.print("   ");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%2d", j);
        }
        System.out.println(); // Salto de línea después de imprimir las posiciones j

        // Pedir al usuario las coordenadas
        boolean correcto = false;
        int intentos = 3;

        while (!correcto && intentos > 0) {
            try {
                System.out.println("Ingrese la coordenada X del tesoro (0-3): ");
                coordenadaX = sc.nextInt();
                System.out.println("Ingrese la coordenada Y del tesoro (0-4):");
                coordenadaY = sc.nextInt();

                if (coordenadaX >= 0 && coordenadaX <= 3 && coordenadaY >= 0 && coordenadaY <= 4) {
                    correcto = true;

                    // Comprobacion de posiciones
                    if (filaTesoro == coordenadaX && columnaTesoro == coordenadaY) {
                        System.out.println("Enhorabuena, ha ganado. Ha acertado la posición del tesoro");
                    } else if (filaMina == coordenadaX && columnaMina == coordenadaY) {
                        System.out.println("Lo siento, ha perdido. Ha encontrado la mina");
                    } else {
                        System.out.println("Esa posición está vacía. Le quedan " + --intentos + " intentos");
                        correcto = false; // Reiniciar el juego
                    }
                } else {
                    System.out.println("Introduzca unas coordenadas correctas");
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        }

        // Imprimir la matriz final con el número de intentos
        for (int i = 0; i < 4; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < 5; j++) {
                if (i == filaTesoro && j == columnaTesoro) {
                    System.out.printf("%s ", tesoro);
                } else if (i == filaMina && j == columnaMina) {
                    System.out.printf("%s ", mina);
                } else {
                    System.out.printf("%s ", vacio);
                }
            }
            System.out.println(); // Salto de línea después de imprimir cada fila
        }

        // Imprimir la línea de guiones justo debajo de la matriz
        System.out.print("   ");
        for (int j = 0; j < 5; j++) {
            System.out.print("--");
        }
        System.out.println(); // Salto de línea después de imprimir la línea

        // Imprimir las posiciones j en la parte inferior
        System.out.print("   ");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%2d", j);
        }
        System.out.println(); // Salto de línea después de imprimir las posiciones j
    }
}
