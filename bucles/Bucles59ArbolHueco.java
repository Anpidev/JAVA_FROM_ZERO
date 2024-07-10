package bucles;

import java.util.Scanner;

/**
 *
 * @author angelaruiz
 */
public class Bucles59ArbolHueco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura del árbol: ");
        int alturaIntroducida = sc.nextInt();

        int espaciosPorDelante = alturaIntroducida - 3;
        int espaciosInternos = 0;

        // Pinta la estrella del árbol
        for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // Empieza por la segunda fila ya que en la primera está la estrella
        int altura = 2;

        while (altura < alturaIntroducida - 1) {
            // inserta espacios delante
            for (int i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            System.out.print("^");

            // pinta espacios internos si no estamos en el extremo
            if (altura > 2) {
                for (int i = 1; i <= espaciosInternos; i++) {
                    System.out.print(" ");
                }
                System.out.print("^");
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        }

        // base de la pirámide
        for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }
        System.out.print("^");

        for (int i = 1; i <= espaciosInternos; i++) {
            System.out.print(" ");
        }

        System.out.println("^");

        // Pinta el tronco
        espaciosPorDelante = alturaIntroducida - 3;

        for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");

        sc.close();
    }
}
