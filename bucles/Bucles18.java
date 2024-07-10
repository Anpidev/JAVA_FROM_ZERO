package bucles;

import java.util.Scanner;

/**
 * Ejercicio 18 Escribe un programa que obtenga los números enteros comprendidos
 * entre dos números introducidos por teclado y validados como distintos, el
 * programa debe empezar por el menor de los enteros introducidos e ir
 * incrementando de 7 en 7.
 *
 * @author angelaruiz
 */
public class Bucles18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    do {
      System.out.println("Introduzca un dígito");
      num1 = sc.nextInt();
      System.out.println("Introduzca un segundo dígito");
      num2 = sc.nextInt();
      if (num1 == num2) {
        System.out.println("Los números no son válidos "
            + "deben ser distintos.");
      }
    } while (num1 == num2);

    if (num2 > num1) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }
    for (int i = num2; i < num1; i = i + 7) {
      System.out.println(i);

    }
    sc.close();
  }
}
