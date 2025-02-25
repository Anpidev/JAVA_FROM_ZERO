package basico.condicionales;

import java.util.Scanner;

/**
 * Ejercicio 18
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author angelaruiz
 */
public class Condicionales18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número entero de máximo cinco cifras");
    String numero = sc.nextLine();
    sc.close();
    int digitos = numero.length();
    if (digitos <= 5) {
      char cifra = numero.charAt(0);
      System.out.println("Su primera cifra es: " + cifra);
    } else {
      System.out.println("Ha introducido mas de cinco cifras");
    }
  }

}
