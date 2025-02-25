package basico.bucles;

import java.util.Scanner;

/**
 * Ejercicio 12 Escribe un programa que muestre los n primeros términos de la
 * serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el
 * segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
 * tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * 144... El número n se debe introducir por teclado.
 *
 * @author angelaruiz
 */
public class Bucles12 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Serie de Fibonacci con  n términos .\n Introduzca n:\n");
    int n = sc.nextInt();
    sc.close();
    int fibo1 = 0;
    int fibo2 = 1;
    int fiboAux = 0;

    for (int i = 0; i < n; i++) {
      fibo1 = fiboAux;
      fiboAux = fibo1 + fibo2;
      fibo2 = fibo1;
      System.out.println(fibo2);

    }
  }
}
