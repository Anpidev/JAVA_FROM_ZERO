package basico.numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 26 Realiza un programa que pinte una tableta de turrón con un
 * bocado realizado de forma aleatoria. El ancho y el alto de la tableta se pide
 * por teclado. El bocado se da alrededor del turrón, obviamente no se puede dar
 * un bocado por en medio de la tableta.
 *
 * @author angelaruiz
 */
public class Num26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el ancho de la tableta: ");
        int ancho = sc.nextInt();
        System.out.println("Introduzca el alto de la tableta: ");
        int alto = sc.nextInt();
        sc.close();

        int mordisco = (int) (Math.random() * (ancho * 2 + (alto - 2) * 2));

        int posicion = 0;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                boolean borde = (i == 0) || (i == alto - 1) || (j == 0) || (j == ancho - 1);

                if ((posicion == mordisco) && borde) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

                if (borde) {
                    posicion++;
                }
            }
            System.out.println();
        }
    }
}
