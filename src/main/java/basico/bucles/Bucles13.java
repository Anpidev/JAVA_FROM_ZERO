package bucles;

import java.util.Scanner;

/**
 * Ejercicio 13 Escribe un programa que lea una lista de diez números y
 * determine cuántos son positivos, y cuántos son negativos.
 *
 * @author angelaruiz
 */
public class Bucles13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    int positivos = 0;
    int negativos = 0;
    do {
      System.out.println("Introduzca un número positivo o negativo");
      int num = sc.nextInt();

      contador++;
      if (num >= 0) {
        positivos++;
      } else {
        negativos++;

      }
    } while (contador < 10);
    sc.close();
    System.out.printf("Ha introducido %d números positivos y %d números negativos", positivos, negativos);
  }

}
