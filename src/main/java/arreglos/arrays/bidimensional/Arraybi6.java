package arreglos.arrays.bidimensional;

import java.util.Scanner;

/*
 * Ejercicio 6
Modifica el programa anterior de tal forma que no se repita ningún número en
el array
 */
public class Arraybi6 {
    public static void main(String[] args) {
        int numero[][] = new int[6][10]; // 6 filas x 10 columnas
        int contador = 0;
        int repetido[] = new int[6 * 10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int valor = 0;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);
        while (!correcto) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    numero[i][j] = (int) (Math.random() * 900 + 100);
                    valor = numero[i][j];
                    System.out.print(numero[i][j] + " ");

                    // Verificar repetición antes de agregar al array repetido
                    boolean comprobacion = false;
                    for (int k = 0; k < contador; k++) {
                        if (repetido[k] == valor) {
                            comprobacion = true;
                            break;
                        }
                    }

                    // Si no está repetido, agregar al array repetido
                    if (!comprobacion) {
                        repetido[contador] = valor;
                        contador++;
                    } else {
                        break;
                    }
                }
                System.out.println();
            }
            correcto = true; // Si llega aquí, todos los números son únicos y saldrá del bucle
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (numero[i][j] > maximo) {
                    maximo = numero[i][j];

                } else if (numero[i][j] < minimo) {
                    minimo = numero[i][j];
                }

            }

        }
        System.out.println("\nEl número máximo del array es " + maximo + " y el mínimo " + minimo);
    }
}
