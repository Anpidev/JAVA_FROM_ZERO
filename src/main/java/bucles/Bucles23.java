package bucles;

import java.util.Scanner;

/**
 *
 * @author angelaruiz
 */
public class Bucles23 {
  public static void main(String[] args) {
    int resultado = 10000;
    int suma = 0;
    int contador = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.println("Ingrese un número");
      int numero = teclado.nextInt();
      teclado.close();

      suma += numero;
      contador++;

    } while (suma <= resultado);

    double media = suma / contador;
    System.out.println("Total acumulado = " + suma);
    System.out.println("Contador de números = " + contador);
    System.out.println("Media de números = " + media);

  }
}
