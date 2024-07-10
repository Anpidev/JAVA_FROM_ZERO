package bucles;

import java.util.Scanner;

/**
 * Ejercicio 24 Escribe un programa que lea un número n e imprima una pirámide
 * de números con n filas como en la siguiente figura: 1 121 12321 1234321
 *
 * @author angelaruiz
 */
public class Bucles24 {

  public static void main(String[] args) {
    System.out.println("Este programa pinta una pirámide hecha a base de números.");
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    Scanner sc = new Scanner(System.in);
    int alturaIntroducida = sc.nextInt();
    sc.close();

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;

    while (altura <= alturaIntroducida) {

      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }

      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }

      System.out.println();

      altura++;
      espacios--;
    } // while
  }
}
