package bucles;

import java.util.Scanner;

/**
 * Ejercicio 16 Escribe un programa que diga si un número introducido por
 * teclado es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 *
 * @author angelaruiz
 */
public class Bucles16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduca un número");
    int num = sc.nextInt();
    sc.close();

    boolean primo = true;

    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        primo = false;
      }
    }

    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
  }

}
