package basico.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 14
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author angelaruiz
 */
public class Condicionales14 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduczca un número entero");
    int numero = sc.nextInt();

    if (numero % 2 == 0 && numero % 5 == 0) {
      System.out.println("El número introducido es par y/o divisible entre cinco");
    } else {
      System.out.println("El número introducido no es par y/o divisible entre cinco");
    }
    sc.close();
  }

}
