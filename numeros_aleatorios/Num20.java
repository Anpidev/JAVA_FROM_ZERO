package numeros_aleatorios;

import java.util.Scanner;

/**
 * Ejercicio 20 Realiza un programa que pinte por pantalla una cuba con cierta
 * cantidad de agua. La capacidad será indicada por el usuario. La cuba se
 * llenará con una cantidad aleatoria de agua que puede ir entre 0 y la
 * capacidad máxima que pueda admitir. El ancho de la cuba no varía. Por favor,
 * indique la capacidad de la cuba en litros: 3 * * ====* ====* ***** La cuba
 * tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *
 * @author angelaruiz
 */
public class Num20 {

    public static void main(String[] args) {
        System.out.println("Pintemos una cuba de agua");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la capacidad máxima de la cuba (número entero)");
        int maximo = sc.nextInt();
        sc.close();

        int capacidad = (int) (Math.random() * maximo + 1);

        for (int i = 0; i < maximo; i++) {
            if (i < (maximo - capacidad)) {
                System.out.println("#    #");
            } else {
                System.out.println("#====#");
            }
        }

        System.out.println("######"); // fondo de la cuba
        System.out.print("La cuba tiene una capacidad de " + maximo);
        System.out.print(" litros y contiene " + capacidad + " litros de agua.");
    }
}
