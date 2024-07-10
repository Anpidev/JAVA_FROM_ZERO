package bucles;
import java.util.Scanner;

/**
 * Ejercicio 59 Escribe un programa que pinte por pantalla un árbol de navidad.
 * El usuario debe introducir la altura. En esa altura va incluida la estrella y
 * el tronco. Suponemos que el usuario introduce una altura mayor o igual a 4.
 *
 * @author angelaruiz
 */
public class Bucles59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura del árbol: ");
        int alturaIntroducida = sc.nextInt();
        sc.close();

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
            for (int i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }

            if (altura > 2) {
                System.out.print("^");
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////

        // base de la pirámide
        for (int i = 1; i < altura * 2 - 2; i++) {
            System.out.print("^");
        }
        System.out.println();

        // Pinta el tronco
        espaciosPorDelante = alturaIntroducida - 3;

        for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");
    }

}
