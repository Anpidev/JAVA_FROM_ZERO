package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 60 Escribe un programa que pinte por pantalla un par de calcetines,
 * de los que se ponen al lado del árbol de Navidad para que Papá Noel deje sus
 * regalos. El usuario debe introducir la altura. Suponemos que el usuario
 * introduce una altura mayor o igual a 4. Observa que la talla de los
 * calcetines y la distancia que hay entre ellos (dos espacios) no cambia, lo
 * único que varía es la altura.
 *
 * @author angelaruiz
 */
public class Bucles60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = sc.nextInt();

        // PARTE SUPERIOR DE LOS CALCETINES
        for (int i = 0; i < altura - 2; i++) {
            System.out.println("***     ***");
        }

        // PARTE INFERIOR DE LOS CALCETINES
        for (int i = 0; i < 2; i++) {
            System.out.println("******  ******");
        }
        sc.close();
    }
}
