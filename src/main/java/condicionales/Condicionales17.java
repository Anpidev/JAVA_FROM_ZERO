package condicionales;

import java.util.Scanner;

/**
 * Ejercicio 17
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 * @author angelaruiz
 */
public class Condicionales17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    String numero = sc.nextLine();
    sc.close();

    char cifra = numero.charAt(numero.length() - 1);
    System.out.println("Su última cifra es: " + cifra);
  }

}
