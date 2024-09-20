package bucles;

import java.util.Scanner;

/**
 * Ejercicio 11 Escribe un programa que muestre en tres columnas, el cuadrado y
 * el cubo de los 5 primeros números enteros a partir de uno que se introduce
 * por teclado.
 *
 * @author angelaruiz
 */
public class Bucles11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número.\nSe calculará su cuadrado y cubo");
    int num = sc.nextInt();
    sc.close();

    int cuadrado = 0;
    int cubo = 0;

    for (int i = num; i < num + 5; i++) {
      cuadrado = (i * i);
      cubo = (i * i) * i;
      System.out.printf("NÚMERO:%5d || CUADRADO:%5d || CUBO:%5d ||%n", i, cuadrado, cubo);
    }

  }

}
