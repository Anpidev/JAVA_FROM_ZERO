package numeros_aleatorios;

import java.util.Scanner;

/**
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Realiza un programa que pinte por pantalla la
 * pecera
 * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias.
 * Por
 * una cuestión de física elemental, ninguno de los animales puede coincidir
 * en la misma posición. Se debe pedir al usuario el anchura y el altura de la
 * pecera,
 * que como mínimo serán de 4 unidades.
 */

public class Num30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, introduzca la altura (minimo 4): ");
    int altura = sc.nextInt();
    System.out.println("Por favor, introduzca la anchura (minimo 4): ");
    int anchura = sc.nextInt();
    sc.close();

    int posicion = 0;
    int posicionPez;
    int posicionCaballito;
    int posicionCaracola;

    do {
      posicionPez = (int) (Math.random() * (altura - 2) * (anchura - 2));
      posicionCaballito = (int) (Math.random() * (altura - 2) * (anchura - 2));
      posicionCaracola = (int) (Math.random() * (altura - 2) * (anchura - 2));
    } while ((posicionPez == posicionCaballito) ||
        (posicionPez == posicionCaracola) ||
        (posicionCaballito == posicionCaracola));

    System.out.println();

    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int i = 2; i < altura; i++) {
      System.out.print("*");
      for (int j = 2; j < anchura; j++) {
        if (posicion == posicionPez) {
          System.out.print("&");
        } else if (posicion == posicionCaracola) {
          System.out.print("@");
        } else if (posicion == posicionCaballito) {
          System.out.print("$");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*");
    }

    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
    System.out.println();
  }

}
