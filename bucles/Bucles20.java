package bucles;

import java.util.Scanner;

/**
 * Ejercicio 20 Igual que el ejercicio anterior pero esta vez se debe pintar una
 * pirámide hueca
 *
 * @author angelaruiz
 */
public class Bucles20 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("PINTEMOS UNA PIRÄMIDE");
    System.out.println("Introduzca un carácter para pintar la pirámide");
    String relleno = sc.nextLine();
    System.out.println("Introduzca la altura de la pirámide");
    int alturaIntroducida = sc.nextInt();
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;

    while (altura < alturaIntroducida) {

      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }

      if (altura > 1) {
        System.out.print(relleno);
      }

      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////

    // base de la pirámide
    for (i = 1; i < altura * 2; i++) {
      System.out.print(relleno);

    }
  }
}
